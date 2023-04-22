/**
 * "Same Question solved for Repeated Numbers also."
 * 
 * Q. Find an Element in a Rotated Sorted Array.
 * 
 * 'A Rotated array is a sorted array which is rotated from a pivot point
 * i.e. sorted Array = [1, 2, 3, 4, 5, 6, 7, 8] is pivoted from element 4
 * the rotated array will be [5, 6, 7, 8, 1, 2, 3, 4]'
 */
public class Q8_Solu_2 {
    public static void main(String[] args) {

        // Main Functioning
        int[] rotatedArray = { 2, 2, 2, 9, 9, 9, 2, 2 };
        int result = solution(9, rotatedArray);
        System.out.println(result);

    }

    // Method to Find Element in Rotated Array
    static int solution(int target, int[] rotatedArray) {
        if (rotatedArray.length == 0)
            return -1;
        // Determining Peak
        int peakEle = pivotInDuplicate(rotatedArray);
        int leftSearch = SearchBinary(target, rotatedArray, 0, peakEle);

        return (leftSearch != -1) ? leftSearch
                : SearchBinary(target, rotatedArray, peakEle + 1, rotatedArray.length - 1);

    }

    // Method to Find Peak Index in a Rotated Array.
    static int pivotInDuplicate(int[] rotatedArray) {
        if (rotatedArray.length == 1)
            return 0;
        int start = 0;
        int end = rotatedArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((mid < rotatedArray.length - 1 && rotatedArray[mid] > rotatedArray[mid + 1])) // pivot found!
                return mid;

            // For Duplicate Numbers
            // if element at Start, Mid and End is same.
            if ((rotatedArray[start] == rotatedArray[mid]) && (rotatedArray[mid] == rotatedArray[end])) {
                // If start is pivot/peak
                if (rotatedArray[start] > rotatedArray[start + 1])
                    return start;
                start++; // Ignoring start as it's duplicate

                // If End is Pivot
                if (rotatedArray[end] < rotatedArray[end - 1])
                    return end;
                end--;
            }

            if (rotatedArray[mid] >= rotatedArray[0]) // If we're at left Array.
                start = mid + 1;
            else
                end = mid - 1; // right array.
        }

        return -1;

    }

    // Binary Search using While Loop.
    static int SearchBinary(int key, int[] array, int start, int end) {

        // loop won't start if array is Empty i.e. (0<-1=false)
        while (start <= end) {

            int mid = start + (end - start) / 2;// (start + end) / 2;
            if (key == array[mid])
                return mid;
            else if (key > array[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
