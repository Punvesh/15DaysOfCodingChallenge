class Solution {
    public int strStr(String haystack, String needle) {

        // If needle is empty, return 0 by definition of the problem.
        if (needle.isEmpty()) return 0;

        // If haystack is shorter than needle, it cannot contain needle → return -1.
        if (haystack.length() < needle.length()) return -1;

        // Loop from index 0 up to the last possible start position:
        // i ≤ haystack.length() − needle.length()
        // Example: haystack length = 9, needle length = 3 → last start index = 6.
        // Because 6th index letter in haystack should match with 0th index letter in needle. 
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            // Compare the substring of length needle.length() starting at i
            // with the needle itself.
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;           // Found the first occurrence.
            }
        }

        // Needle was not found in haystack.
        return -1;
    }
}
