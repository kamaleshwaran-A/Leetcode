class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        int i;
        char[] str=s.toCharArray();
        for(i=0;i<str.length;i++)
        {
            if(Character.isDigit(str[i]))
            {
                  stack.pop(); 
            }
            else
            {
                stack.push(str[i]);
            }
            
        }
        StringBuilder str1=new StringBuilder();
        for(char h:stack)
        {
            str1.append(h);
        }
        return str1.toString();
      

        
    }
}