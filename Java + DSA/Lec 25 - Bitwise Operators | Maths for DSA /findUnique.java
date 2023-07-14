/**
 * Q. Given an array containing every number twice and a single unique number,
 *  Find the number that occurs only once.
 * 
 * We are using 'XOR' operator.
 *  As we know that 'a^a = 0' | Every Duplicate will be 0
 *             then 'a ^ 0 = a' | Hence resulting into unique element.
*/
public class findUnique {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 2, 1, 6, 7, 6, 3};
        System.out.println("The Unique Element is: " + uniqueNum(array));
    }

    static int uniqueNum(int[] array){
        int result = 0;
        for(int i: array){
            result ^= i;
        }
        return result;
    }
}
