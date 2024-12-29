class Solution {
    public void moveZeroes(int[] nums) {
        int i,n,a=0;
        n=nums.length;
        for(i=0;i<n;i++)
        {
           if(nums[i]!=0)
           {
            nums[a]=nums[i];
           a++;
           }
           
        }
        for(i=a;i<n;i++)
        {
            nums[i]=0;
        }
        }
    
        
    }