/**
 * Q. Finding Element in a Mountain Array
 */

public class Q7_FindInMountainArray {
    public static void main(String[] args) {
        // Main Functioning.
        int[] mountArray = {1, 5, 6, 7, 8, 12, 5, 4, 3 ,2, 1};
        int result = FindElement(12, mountArray);
        System.out.println(result);
    }

    // Solution Function to Find element in Mountain Array.
    static int FindElement(int target, int[] mountainArray) {
        int peakIndex = FindPeak(mountainArray);
        int leftSearch = SearchBinary(target, mountainArray, 0, peakIndex);
         
        return (leftSearch!=-1)?leftSearch:SearchBinary(target, mountainArray, peakIndex+1, mountainArray.length-1);
    }

    // Finding the Peak Index in a Mountain Array.
    static int FindPeak(int[] mountainArray) {

        if (mountainArray.length == 1)
            return 0;

        int start = 0, end = mountainArray.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((mountainArray[mid] > mountainArray[mid + 1]) && mountainArray[mid] > mountainArray[mid - 1])
                return mid;

            else if (mountainArray[mid] > mountainArray[mid + 1])
                end = mid - 1;

            else
                start = mid + 1;

        }
        return -1;
    }


    // Order Agnostic Binary Search to Search in both Left & Right Array.
    static int SearchBinary(int target, int[] array, int start, int end) {
        boolean ascending = array[start] < array[end]; // Determining Order.

        // loop won't start if array is Empty i.e. (0<-1=false)
        if (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == array[mid])
                return mid;

            else if ((target > array[mid])) {

                // Introduced Condition for Order-Agnostic Binary Search.
                if (ascending)
                    return SearchBinary(target, array, mid+1, end);
                else
                return SearchBinary(target, array, start, mid-1);

            } else {
                if (ascending)
                return SearchBinary(target, array, start, mid-1);
                else
                return SearchBinary(target, array, mid+1, end);
            }
        }

        return -1;
    }
}