/**
 * Q. Find i-th bit of a given number.
 * 
 *      i.e. the number is "182" (Decimal) 
 *      representing "10110110" (Binary).
 *      we will count from 1-st to i-th bit from the Right Side.
 *   i.e 5-th bit of "182" is 
 */

public class findIthBit {
    public static void main(String[] args) {
        int n = 270; // 100001110
        System.out.println(findBit(n, 4));

    }
    static int findBit(int num, int i){
        // Right Shifting
        num  >>= (i-1);
        int bit = num&1; // getting Last Bit.
        return bit;
    }
}