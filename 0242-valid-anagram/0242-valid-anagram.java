class Solution {
    public boolean isAnagram(String s, String t) {
        // Quick check: if lengths differ, can't be anagrams.
        if (s.length() != t.length())
            return false;
        // Change strings to char arrays for sorting and comparison.
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        // Sort both arrays so we can compare them easily.
        Arrays.sort(sarray);
        Arrays.sort(tarray);
        // If sorted arrays match, they're anagrams!.
        return Arrays.equals(sarray, tarray);
    }
}