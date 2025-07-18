

import java.util.*;

public class TopKelements {
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> count = new HashMap<>();//Creating an hashmap
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            
        }

        // Step 2: Create bucket array
        List<Integer>[] freq = new List[nums.length + 1];
        System.out.println(Arrays.toString(freq));
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
            
        }

        // Step 3: Fill buckets with numbers based on frequency
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int c = entry.getValue();
            freq[c].add(num);
        }

        // Step 4: Collect top k frequent elements from the buckets
        List<Integer> res = new ArrayList<>();
        for (int i = freq.length - 1; i >= 0 && res.size() < k; i--) {
            for (int n : freq[i]) {
                res.add(n);
                if (res.size() == k) {
                    break;
                }
            }
        }

        // Convert list to array and return
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int k1 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums1, k1)));  // Output: [3, 2]

        int[] nums2 = {7, 7};
        int k2 = 1;
        System.out.println(Arrays.toString(topKFrequent(nums2, k2)));  // Output: [7]
    }
}

