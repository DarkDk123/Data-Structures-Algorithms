/**
 * Q. Find Whether a number is "power of 2" (2^x) or not.
 * 
 *     We Know that to be a "power of 2" a number must contain
 *     only one Set Bit ("1"), everything else must be zero. i.e. 10, 100, 1000 = 2, 4, 3 etc.
 * 
 *     Solu (1): We can count occurences of "1" with a loop & Right Shift operator.
 *               but it's a over workdone method.
 * 
 *     INSTEAD
 *  
 *     Solu (2): We know that every 1000...0 number is the least number represented by 
 *               these particular no. of bits.
 *              
 *              i.e. 1000 = 111 + 1
 *              
 *              So we can substract '1' from n then perform "&" Operation with n that results in "0"
 *              only for "2^x" numbers.
 */

public class findPower2Number {
    public static void main(String[] args) {
        int n = 128;
        System.out.println("Is " + n + " a power of 2 : " + findNumber(n));
    }

    static boolean findNumber(int n) {
        boolean result = (n & (n - 1)) == 0;
        return result;
    }
}
