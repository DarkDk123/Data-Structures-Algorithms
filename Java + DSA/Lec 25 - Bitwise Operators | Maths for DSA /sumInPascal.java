/**
 * Q. Find the sum of terms in the n-th row of Pascals Triangle Using Bitwise operators.
 * 
 *  We know that sum of n-th row in pascal's triangle is "2^n" | rows from 0-th to n-th
 *  We will assume rows starting from 1 to n.
 * 
 *  To perform this we'll Left Shift 1 by (n-1)
 * 
 */

public class sumInPascal {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findSum(n));        
    }

    static int findSum(int n){
        return 1 << (n-1);
    }

}
