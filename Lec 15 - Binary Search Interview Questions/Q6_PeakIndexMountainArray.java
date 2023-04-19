/**
 * Q. Finding Peak Idex in a Mountain Array.
 * 
 * "A Mountain Array ('Biotonic Array') is an array containing
 * firstly elements in ascending order than elements in descending order"
 * 
 * # It doesn't contain duplicate elements
 */

public class Q6_PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] mountArray = { 1, 4, 5, 8, 23, 45, 23, 12, 11, 10, 8, 4, 1, 0 };

        int result = solution(mountArray);
        System.out.println(result);
    }

    /**
     * Solution Code for Peak Index in Mountain Array
     * 
     * @param target        : Target element to find in.
     * @param mountainArray : A Biotonic Array to search in.
     * @return Returns an Integer as Index of Peak Element
     */

    static int solution(int[] mountainArray) {

        // Return 0 if size of array is 1
        if (mountainArray.length == 1) return 0;

        int start = 0, end = mountainArray.length - 1;

        // Applying Binary Search (Using While loop)
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If mid is the Peak Element
            if ((mountainArray[mid] > mountainArray[mid + 1]) && mountainArray[mid] > mountainArray[mid - 1]) return mid;

            // If above condition fails.
            // Check if we are in the descending part of the array.
            else if (mountainArray[mid] > mountainArray[mid + 1]) end = mid - 1; // Changing the end to (mid1)

            // Else we are in ascending part of the array.
            else start = mid + 1; // As same changing the Start.

        }

        // returning -1 if loop doesn't executed. (Array is Empty!!)
        return -1;
    }
}