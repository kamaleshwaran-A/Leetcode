class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,n1,n2,a1=0,a2=0;
        StringBuilder res =new StringBuilder("");
        char[] str1=word1.toCharArray();
        char[] str2=word2.toCharArray();
        n1=str1.length;
        n2=str2.length;
        while(i<n1&&i<n2)
        {
            res=res.append(str1[i]);
            res=res.append(str2[i]);
            i++;
        }
        if(i<n1)
        {
            res=res.append(word1.substring(i));
        }
        if(i<n2)
        {
            res=res.append(word2.substring(i));
        }
        return res.toString();
         
    }
}