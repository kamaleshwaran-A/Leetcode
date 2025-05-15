

class Solution 
{
    public static int mcm(int[] nums,int i,int j,int n,int dp[][])
    {
        if(i>j)
        {
           return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int left=i-1>=0?nums[i-1]:1;
        int right=j+1<n?nums[j+1]:1;
        
        int max=0;        
       
        for(int k=i;k<=j;k++)
        {
            max=Math.max(left*nums[k]*right+mcm(nums,i,k-1,n,dp)+mcm(nums,k+1,j,n,dp),max);
        }
        return dp[i][j]=max;
    }
    public int maxCoins(int[] nums) 
    {
        int n=nums.length;
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return mcm(nums,0,nums.length-1,n,dp);
    }
}