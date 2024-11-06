class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i,max=0;
        ArrayList<Boolean> list=new ArrayList<>();
        for(i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        for(i=0;i<candies.length;i++)
        {
            candies[i]=candies[i]+extraCandies;
            if(candies[i]>=max)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
            candies[i]=candies[i]-extraCandies;
        }
        return list;

    }
}