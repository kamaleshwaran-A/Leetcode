class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            // Append the character
            str.append(currentChar);

            // Append the count if greater than 1
            if (count > 1) {
                str.append(count);
            }
        }

        // Update the original array with the compressed result
        for (int j = 0; j < str.length(); j++) {
            chars[j] = str.charAt(j);
        }

        return str.length();
    }
}
