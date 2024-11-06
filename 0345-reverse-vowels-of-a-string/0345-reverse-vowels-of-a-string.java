class Solution {
    public String reverseVowels(String s) {
        int i,a=0;
       StringBuilder vow=new StringBuilder("");
       for(i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
        {
            vow.append(s.charAt(i));
        }
       }
       String v=vow.reverse().toString();
       char[] vstr=v.toCharArray();
       for(i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
      {
      s = s.substring(0, i) + vstr[a] + s.substring(i + 1);
        a++;
      }

       }
       return s;
    }
}