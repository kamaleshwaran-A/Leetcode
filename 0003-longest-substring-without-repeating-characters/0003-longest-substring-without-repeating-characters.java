class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0, max = 0, start = 0;  // Added 'start' to track the substring's start

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                // Update max before modifying count
                max = Math.max(max, count);

                // Move start pointer to the next of last seen duplicate character
                start = Math.max(start, map.get(c) + 1);

                // Recalculate count based on new start position
                count = i - start + 1;
            } else {
                count++;
            }

            // Store the latest index of the character
            map.put(c, i);
        }

        return Math.max(max, count);  // Ensure last substring is considered
    }
}
