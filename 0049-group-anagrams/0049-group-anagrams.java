class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // Create frequency-based key
            // for eat e -> count[101-97] -> count[4]++
            //         a -> count[97-97] -> count[0]++
            //         t -> count[116-97] -> count[19]++
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            
            // Convert frequency array to string key
            // count[0,4,19] -> 1#0#0#0#1#0#0#0#0#0#0#0#0#0#0#0#0#0#0#1#0#0#0#0#0#0#
            // 1 at index 0,4,19

            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append(count[i]).append("#");
            }
            
            // Group by frequency key
            //("1#0#0#0#1#0#0#0#0#0#0#0#0#0#0#0#0#0#0#1#0#0#0#0#0#0#" : ["eat"])
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}
