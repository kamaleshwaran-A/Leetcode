class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int i,suffix=1;
        ans[0]=1;
        for(i=1;i<nums.length;i++)
        {
          ans[i]=ans[i-1]*nums[i-1];
        } 
        for(i=nums.length-1;i>=0;i--)
        {
            ans[i]=suffix*ans[i];
            suffix=suffix*nums[i];
        }
        return ans;
    }
}