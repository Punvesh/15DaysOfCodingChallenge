import java.util.*;

class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && Math.abs(stack.charAt(len - 1) - c) == 32) {
                // ASCII diff between uppercase and lowercase of same letter is 32
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(c);
            }
        }
        
        return stack.toString();
    }
}
