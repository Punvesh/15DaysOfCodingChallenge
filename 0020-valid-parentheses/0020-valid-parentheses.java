class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        //convert string to character array 
        for (char ch : s.toCharArray()) {
            // Push expected closing brackets; check and match when a closing bracket appears.
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            // stack.pop() != ch will check if '}' in stack it will pop() it and check ch is not equal.
            // pop()=} ch = } -> }!=} -> false then stack become empty.
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }
        // it will return true if stack is empty.
        return stack.isEmpty();
    }
}