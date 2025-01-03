class Solution {
    public int largestAltitude(int[] gain) {
        int heights[]=new int[gain.length+1];
        int i;
        heights[0]=0;
        for(i=1;i<heights.length;i++)
        {
            heights[i]=heights[i-1]+gain[i-1];
        }
        int max=0;
        for(i=0;i<heights.length;i++)
        {
            if(heights[i]>max)
            {
                max=heights[i];
            }
        }
        return max;
        
    }
}