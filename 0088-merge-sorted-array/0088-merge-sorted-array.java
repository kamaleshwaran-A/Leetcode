import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i, a = 0;
        
        // Copy elements from nums2 to nums1 starting from index m
        for (i = m; i < m + n; i++) {
            nums1[i] = nums2[a];
            a++;
        }

        // Sort the entire nums1 array
        Arrays.sort(nums1);
    }
}
