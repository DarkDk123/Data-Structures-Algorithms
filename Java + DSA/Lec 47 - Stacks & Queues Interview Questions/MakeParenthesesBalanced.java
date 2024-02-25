/**
 * Q. Finding insertions required to make parentheses valid!!
 * Here a valid parenthesis is like "())"
 */
public class MakeParenthesesBalanced {
    public int minInsertions(String s) {
        int open = 0, close = 0; // Open counts remaining open parentheses, and close counts close parentheses
                                 // required!

        int i = 0; // For looping, use while loop!
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(')
                open++; // Remaining open parentheses
            else {
                if (open > 0 && i + 1 < s.length() && s.charAt(i + 1) == ')') { // complete parenthesis
                    open--;
                    i += 1;
                } else if (open > 0) { // Required 1 close parenthesis
                    open--;
                    close++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == ')') { // required one open parentheses
                    close++;
                    i += 1;
                } else { // Required one open & one close parenthesis
                    close += 2;
                }
            }

            i++;
        }

        return close + 2 * open;
    }

    public static void main(String[] args) {
        System.out.println("Required insertions : " + new MakeParenthesesBalanced().minInsertions("()))()"));
    }
}