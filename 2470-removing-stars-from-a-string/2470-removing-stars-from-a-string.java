class Solution {
    public String removeStars(String s) {
        int i;
        char[] str=s.toCharArray();
        StringBuffer str1=new StringBuffer();
        for(i=0;i<str.length;i++)
        {
            if(str[i]=='*')
            {
                str1.deleteCharAt(str1.length()-1);
            }
            else
            {
                str1.append(str[i]);
            }

            
        }
         return str1.toString();
        
        
    }
}