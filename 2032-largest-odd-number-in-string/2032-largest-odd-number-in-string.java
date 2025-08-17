class Solution {
      public String largestOddNumber(String num) {
        // Traverse from right to left to find the rightmost odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            // Check if current digit is odd
            if ((digit - '0') % 2 == 1) {
                // Return substring from start to this position (inclusive)
                return num.substring(0, i + 1);
            }
        }
        
        // If no odd digit found, return empty string
        return "";
    }
}