class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // Create frequency-based key
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            
            // Convert frequency array to string key
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append(count[i]).append("#");
            }
            
            // Group by frequency key
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}
