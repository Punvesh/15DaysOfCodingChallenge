class Solution {
    public boolean isValid(String s) {
        int opencount = 0;
        int closecount = 0;
        for(char ch : s.toCharArray()){
           if (ch == '(' || ch == '{' || ch == '[') {
                opencount++;
            }else{
                closecount++;
            } 
        }
        if(opencount!=closecount) return false;
        Stack<Character> stack = new Stack();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;

                }
            }
        }
        return stack.isEmpty();
    }
}