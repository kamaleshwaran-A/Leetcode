class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0, max = 0, start = 0;  
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
               
                max = Math.max(max, count);

              
                start = Math.max(start, map.get(c) + 1);

           
                count = i - start+1;
            } else {
                count++;
            }

          
            map.put(c, i);
        }

        return Math.max(max, count); 
    }
}
