/**
 * Q. Find Number of Set Bits in a Number | Bit manipulation.
 */

public class FindSetBits {
    public static void main(String[] args) {
        int num = 1023;
        System.out.printf("Binary of %d is : %s.\n", num, Integer.toBinaryString(num));
        System.out.println("Number of set Bits is " + setBits3(num));
    }

    // Method 1
    static int setBits(int n){
        int result = 0;

        while (n>0){
            if ((n&1)==1) result++;
            n >>= 1;
        }

        return result;

    }

    // Method 2
    static int setBits2(int n) {
        int result = 0;
        while (n>0){
            // Getting Last Set Bit.
            int lastSetBit = n & (-n);

            // Substract Last Set Bit from n to get next last set bit.
            n -= lastSetBit;
            // Couting set bits
            result++;
        }

        return result;
    }

    // Method 3
    static int setBits3(int n){
        int result = 0;
        while (n>0){
            n &= (n-1);
            result++;
        }

        return result;
    }

}
