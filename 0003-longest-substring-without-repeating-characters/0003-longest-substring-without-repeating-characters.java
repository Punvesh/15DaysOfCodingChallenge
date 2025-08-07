class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap to store the last index of each character
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0; // Start of the sliding window
        int maxLen = 0; // Maximum length of substring without repeating characters

        // Iterate through the string
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            // If the character is already in the map and its index is within the current window
            if (map.containsKey(ch) && map.get(ch) >= start) {
                // Move the start of the window to the right of the duplicate character's last index
                start = map.get(ch) + 1;
            }

            // Update the HashMap with the current character's index
            map.put(ch, end);

            // Calculate the maximum length
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}