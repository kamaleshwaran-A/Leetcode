class Solution {
    public int lengthOfLongestSubstring(String str) {
        HashSet<Character> set=new HashSet<>();
        int right,left=0,max=0;
        for(right=0;right<str.length();right++)
        {
            while(set.contains(str.charAt(right)))
            {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
        
    }
}