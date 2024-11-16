class Solution {
    int max = 0;
// will store the max path throught the recursive solution
    public int fun(int arr[][],int row,int col,int dp[][]){
        if(dp[row][col]!=0) return dp[row][col];
// 0 is the default value of 2d Array, each cell has atleast 1 length of increasing path,
// which is the number itself, so if the value in DP isn't 0,
// that means we have already traversed it.
        int curr = 1;
// {
        if(row+1<arr.length && arr[row+1][col]>arr[row][col]){
            curr = Math.max(curr,1+fun(arr,row+1,col,dp));
        }
        if(row-1>=0 && arr[row-1][col]>arr[row][col]){
            curr = Math.max(curr,1+fun(arr,row-1,col,dp));
        }
        if(col+1<arr[0].length && arr[row][col+1]>arr[row][col]){
            curr = Math.max(curr,1+fun(arr,row,col+1,dp));
        }
        if(col-1>=0 && arr[row][col-1]>arr[row][col]){
            curr = Math.max(curr,1+fun(arr,row,col-1,dp));
        }
    // }, In this block we are trying to see if neighbouring cell
// has value greater than current cell, 
// if yes then we start a new function at the that cell
        max = Math.max(max,curr);
        dp[row][col] = curr;
// store the ans of particular cell to dp
        return curr;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int dp[][] = new int[matrix.length][matrix[0].length];
// this is to store the longest increasing path for already travelled blocks
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                fun(matrix,i,j,dp);
            }
        }
// this is pretty simple we are trying to find the longest increasing path, 
// which starts from matrix[i,j] 
        return max;
    }
}