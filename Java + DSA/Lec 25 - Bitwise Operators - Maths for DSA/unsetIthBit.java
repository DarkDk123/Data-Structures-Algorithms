/**
 * Q. Unset i-th bit of a number.
 * 
 *  Much same as previous one.
 * 
 *  Just Creating a Mask with flipped bits as before
 *  i.e. Mask = !(1<<(i-1))
 *  
 *  And performing an "AND" Operation instead of "OR".
 */
public class unsetIthBit {
    public static void main(String[] args) {
        int n = 1214; // 10010111110
        System.out.println(setBit(n, 2));
    }

    // Method for unsetting i-th bit.
    static int setBit(int num, int i){
        // creating mask
        int mask = ~(1<<(i-1));

        int result = num & mask; // Answer
        return result;
    }
}
