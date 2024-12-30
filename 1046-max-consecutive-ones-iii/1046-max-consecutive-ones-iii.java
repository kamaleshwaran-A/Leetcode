class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, max = 0; // i is the start of the window, max is the maximum length

        for (int j = 0; j < nums.length; j++) { // j is the end of the window
            if (nums[j] == 0) { 
                k--; // Decrement k for every 0 in the window
            }

            // If k becomes negative, the window is invalid, so move the start of the window
            while (k < 0) {
                if (nums[i] == 0) {
                    k++; // Increment k if we're removing a flipped 0
                }
                i++; // Shrink the window from the left
            }

            // Calculate the current valid window length
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}
