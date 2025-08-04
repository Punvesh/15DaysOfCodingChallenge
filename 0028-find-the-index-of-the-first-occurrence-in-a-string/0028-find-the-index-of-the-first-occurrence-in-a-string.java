class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.isEmpty()) return 0;
        // haystack length is lesser than needle means it don't contains string in haystack so return -1; 
        if(haystack.length()<needle.length()) return -1;
        //reson behind the condition "i<=haystack.length()-needle.length()" is if word length is needle length is 3 and haystack length is 9 .
        //it will go until 6 bacause if index 6 doesn't as the first letter of needle they string doesn't match.  
        for(int i=0;i<=haystack.length()-needle.length();i++){
            //i,i+3 -> sad.equals(sad) -> i means index
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        //if string not found in haystack return -1.
        return -1;
    }
}