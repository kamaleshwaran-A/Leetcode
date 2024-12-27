import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;

            // Check if the complement exists in the map
            if (map.getOrDefault(complement, 0) > 0) {
                count++;
                map.put(complement, map.get(complement) - 1); // Decrease the count of the complement
            } else {
                // Add the current number to the map
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}
