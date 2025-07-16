package Java;
import java.util.*;

public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                int j = numMap.get(complement);
                // Return indices in ascending order
                return new int[] {Math.min(i, j), Math.max(i, j)};
            }

            numMap.put(nums[i], i);
        }

        // If no solution is found (as per problem statement, this won't happen)
        return new int[] {-1, -1};
    }

    // For testing
    public static void main(String[] args) {
        Twosum sol = new Twosum();

        int[] result1 = sol.twoSum(new int[]{3, 4, 5, 6}, 7);
        System.out.println(Arrays.toString(result1)); // [0, 1]
        }
    }