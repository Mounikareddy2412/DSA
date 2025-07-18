package Arrays.Java;
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int freq : count) {
                keyBuilder.append(freq).append('#');
                
            }
            
            String key = keyBuilder.toString();
            

            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(s);

        }

        // Convert map values to a list
        List<List<String>> result = new ArrayList<>(res.values());

        // Sort each individual anagram group
        for (List<String> group : result) {
            Collections.sort(group);
        }

        // Optional: sort the entire list of groups by the first element in each group
        result.sort(Comparator.comparing(a -> a.get(0)));

        return result;
    }

    public static void main(String[] args) {
        GroupAnagrams  s = new GroupAnagrams ();
        String[] input = {"act", "pots", "tops", "cat", "stop", "hat"};
        List<List<String>> result = s.groupAnagrams(input);

        System.out.println(result);

        }
}

