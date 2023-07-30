/**
 * Q. Reverse an Integer with Recursion.
 *
 * Key is : Log10(n) + 1 == digits in n.
 * 
 */
public class revNum {
    public static void main(String[] args) {
        int n = 1500123;
        System.out.println("The reverse of " + n + " is : " + reverse(n));

    }

    // Method to reverse
    static int reverse(int n) {
        // Sometimes you need to provide extra parameters
        // to solve a recursion problem.
        // In this case, create another helper function.
        int digits = (int)Math.log10(n) + 1; // No. of digits.
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n == 0)
            return 0;

        return (int)((n % 10) * Math.pow(10, digits-1) + helper(n / 10, digits-1));

    }
}