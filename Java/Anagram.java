package Java;
import java.util.Arrays;

class solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}

class Anagram {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";

        solution s3 = new solution();
        System.out.println(s3.isAnagram(s, t));  // Output: true
    }
}
