class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        //convert string to character array 
        for (char ch : s.toCharArray()) {
            //if c
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }
        return stack.isEmpty();
    }
}