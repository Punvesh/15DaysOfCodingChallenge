import java.util.*;

public class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<int[]> deque = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            if (!deque.isEmpty() && deque.peekLast()[0] == c) {
                deque.peekLast()[1]++;
                if (deque.peekLast()[1] == k) {
                    deque.removeLast();
                }
            } else {
                deque.addLast(new int[]{c, 1});
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int[] pair : deque) {
            char ch = (char) pair[0];
            int count = pair[1];
            for (int i = 0; i < count; i++) {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}
