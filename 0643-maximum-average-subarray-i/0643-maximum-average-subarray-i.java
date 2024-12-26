class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int i,c=0;
        for(i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        double avg=sum/k;
        double maxavg=avg;
        for(i=k;i<nums.length;i++)
        {
            sum=(double)(sum+nums[i]-nums[c]);
            c++;
            avg=(double)(sum/k);
            if(maxavg<avg)
            {
                maxavg=avg;
            }
        }
        return maxavg;
    }
}