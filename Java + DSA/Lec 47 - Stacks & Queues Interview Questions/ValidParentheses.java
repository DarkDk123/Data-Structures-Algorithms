/**
 * Using stack, we can trace where parentheses was open, and it is closes or not!!
 */

import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.isEmpty() || stack.peek() != ch)
                        return false;
                    else
                        stack.pop();
                    break;
            }
        }

        return stack.isEmpty();
    }
}