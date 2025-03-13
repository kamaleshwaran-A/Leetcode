class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int row=text1.length();
        int col=text2.length();
        int dp[][]=new int[row+1][col+1];
        int i,j;
        for(i=0;i<row;i++)
        {
            dp[i][0]=0;
        }
         for(i=0;i<col;i++)
         {
            dp[0][i]=0;
         }
         for(i=1;i<=row;i++)
         {
            for(j=1;j<=col;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }

            }
         }
         return dp[row][col];
        

        
    }
}