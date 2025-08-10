class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        s = s.replace(" ", ""); // remove spaces

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // if digit, build the number
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            // if operator or last char, process based on previous sign
            if (!Character.isDigit(c) || i == s.length() - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = c;
                num = 0;
            }
        }

        // sum up all values in the stack
        int result = 0;
        for (int val : stack) {
            result += val;
        }
        return result;
    }
}
