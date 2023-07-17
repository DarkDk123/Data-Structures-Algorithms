/**
 * Q. Find the Position of Right Most Set bit.
 * 
 *      we'll keep doing right shift by 1 & Counting untill
 *      we find a set bit (1) by Number & 1.
 * 
 *      We'll Count position from 1 to n, and return -1 means no 'set' bit. (num==0)
 */
public class findRMSetBit {
    public static void main(String[] args) {
        int n = 1024;
        int result = findPosition(n);
        if (result != -1) {
            System.out.println("Position of Right Most SetBit in " + n + " is " + result);
        }
        else System.out.println("No set bit found !!");
    }

    static int findPosition(int num) {
        int position = 0;
        while (num > 0) {
            position++;
            if ((num & 1) == 1)
                return position;
            num >>= 1;
        }
        return -1;
    }
}
