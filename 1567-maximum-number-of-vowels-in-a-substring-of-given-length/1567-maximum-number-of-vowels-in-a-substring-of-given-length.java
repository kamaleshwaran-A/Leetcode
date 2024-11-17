class Solution {
    public int maxVowels(String s, int k) {
        int arr[]=new int[128];
        int i,count=0,max=0;
        arr['a']=1;
        arr['e']=1;
        arr['i']=1;
        arr['o']=1;
        arr['u']=1;
        for(i=0;i<k;i++)
        {
           count=count+arr[s.charAt(i)];
        }
        max=count;
        for(i=k;i<s.length();i++)
        {
            count=count+arr[s.charAt(i)]-arr[s.charAt(i-k)];
            max=Math.max(count,max);
            if(max==k)
            {
                return k;
            }
        }
        return max;

        
    }
}




