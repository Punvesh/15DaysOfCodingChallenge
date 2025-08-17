
class Solution {
    
    // Greedy approach - O(n log n + m log m) time, O(1) space
    public int findContentChildren(int[] g, int[] s) {
        // Sort both arrays
        Arrays.sort(g);  // greed factors of children
        Arrays.sort(s);  // sizes of cookies
        
        int child = 0;  // pointer for children array
        int cookie = 0; // pointer for cookies array
        int content = 0; // count of content children
        
        // Try to assign cookies to children
        while (child < g.length && cookie < s.length) {
            // If current cookie can satisfy current child
            if (s[cookie] >= g[child]) {
                content++;  // child becomes content
                child++;    // move to next child
            }
            cookie++;  // always move to next cookie (used or too small)
        }
        
        return content;
    }
    
    // Alternative implementation with cleaner logic
    public int findContentChildrenV2(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int contentChildren = 0;
        int cookieIndex = 0;
        
        for (int childIndex = 0; childIndex < g.length && cookieIndex < s.length; childIndex++) {
            // Find a cookie that can satisfy current child
            while (cookieIndex < s.length && s[cookieIndex] < g[childIndex]) {
                cookieIndex++;
            }
            
            // If we found a suitable cookie
            if (cookieIndex < s.length) {
                contentChildren++;
                cookieIndex++; // use this cookie
            }
        }
        
        return contentChildren;
    }

}