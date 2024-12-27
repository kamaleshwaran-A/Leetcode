class Solution {
    public int maxOperations(int[] nums, int k) {
        int i,j,count=0;
        Arrays.sort(nums);
        i=0;
        j=nums.length-1;
        while(i<j)
        {
            if(nums[i]+nums[j]==k)
            {
                count++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]>k)
            {
                j--;
            }
            else if(nums[i]+nums[j]<k)
            {
                i++;
            }
        }
        return count;
        
    }
}