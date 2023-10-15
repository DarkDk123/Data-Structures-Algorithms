/**
 * Q. Set i-th bit of a number.
 * 
 *  To set a bit we mean ensuring it's value as "1".
 *  we'll 'OR' operation '1' with i-th bit to ensure it as "1".
 *  every other bit is 'OR' with '0' to keep it as it is.
 * 
 *  Hence, we'll create a 'mask' to do 'OR' operation with.
 
 *  To get the mast: we'll do left shift 1 with (i-1) positions.
 *  i.e. Mask = 1 << (i-1)
 */
public class setIthBit {
    public static void main(String[] args) {
        int n = 12; //1100
        System.out.println(setBit(n, 1));
    }

    // Method for setting i-th bit.
    static int setBit(int num, int i){
        // creating mask
        int mask = 1<<(i-1);

        int result = num | mask; // Answer
        return result;
    }
}
