/**
 * Q. Given an array containing every number 3-times and a single unique number,
 * Find the number that occurs only once.
 * 
 * We can't use "XOR" Operator here, cause duplicates are appearing odd-times.
 * So they can't cancel out to zero, untill they're even-times.
 * 
 * Used approach of multiple of the number of times repeated.
 * 
 */
public class findUniqueOdd {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 2, 3, 3, 8, 7, 8, 8};
        System.out.println("The Unique Element is: " + uniqueNum(array));
    }

    static int uniqueNum(int[] array) {
        int result = 0;
        for (int i = 0; i < 32; i++) { // Suppose Int = 32 Bits = 4 Bytes
            int sum = 0;
            for (int num : array) {
                // Increamenting Sum if bit is current 1.
                sum += (num >> i) & 1;
            }

            // If sum of set bits for current digits isn't a multiple of 3.
            // Set result's bit to one
            if (sum % 3 != 0)
                result |= (1 << i);

        }
        return result;
    }
}
