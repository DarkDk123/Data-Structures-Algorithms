/*
 * Calculating Large Factorials that ranges outside of int range!
 */

import java.math.BigInteger;

public class FactorialBigInteger {
    
    public static void main(String[] args) {

        // Let's get factorial
        System.out.println(fact(5));

        // for large numbers
        System.out.println(fact(54498)); // This would error if used with `int`.
    }


    // Factorial function
    public static BigInteger fact(int n){
        BigInteger ans = BigInteger.valueOf(1);
        
        for (int i = 2; i <= n; i++) {
            BigInteger num = BigInteger.valueOf(i);
            ans = ans.multiply(num);
        }

        return ans;
    }
}
