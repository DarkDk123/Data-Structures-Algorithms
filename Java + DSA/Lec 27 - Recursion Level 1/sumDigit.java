/**
 * Q. Find Sum of all the digits of a given number.
 *  
 *     i.e. if n = 1245.
 *          Sum = 1+2+4+5 = 12.
 */

public class sumDigit {
    public static void main(String[] args) {
        int n = 12451;
        System.out.println("The Sum is : " + digitSum(n));
    }

    static int digitSum(int n){
        if (n==0) return 0;

        int lastDigit = n%10;
        return (lastDigit + digitSum(n/10));
    }
}
