import java.util.Arrays;

/**
 *   Q. Merge Sort Using Recursion Inplace.
 * 
 *      Sorting an Array using Recursive, Inplace merge sort.
 *      By keeping indexes of each sub-arrays regarding the original array to Sort Inplace.
 * 
 */

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 1, 10, 98, 50, 24, 21, 10, 12, -52, 12, -0, -54, 12, -7 };
        mergeSort(arr1, 0, arr1.length / 2, arr1.length - 1);
        System.out.println("Array After Sorting Inplace: " + Arrays.toString(arr1));

    }

    // Recursive Function for Merge Sort
    public static void mergeSort(int[] arr, int start, int mid, int end) {
        // Base condition
        if (start < end) {

            int mid1 = (start + mid) / 2; // Left sub-array's mid
            int mid2 = ((mid + 1) + end) / 2; // Right sub-array's mid

            // Sort Left & Right Inplace.
            mergeSort(arr, start, mid1, mid - 1); // Left part
            mergeSort(arr, mid, mid2, end); // Right Part

            // Merge sorted sub-arrays.
            merge(arr, start, mid, end); // merge & return.
        }

        return;
    }

    // Merge two Sorted Sub-Arrays using indexes.
    public static void merge(int[] arr, int start, int start2, int end) {
        int[] mix = new int[end - start + 1];
        int k = 0;
        int i = start;
        int j = start2;

        while (i <= start2 - 1 || j <= end) {
            // Both sub-arrays contain elements.
            if (i <= start2 - 1 && j <= end) {
                if (arr[i] < arr[j]) {
                    mix[k++] = arr[i++];
                } else {
                    mix[k++] = arr[j++];
                }
            }

            // Sub-array 2 is completed.
            else if (i <= start2 - 1) {
                mix[k++] = arr[i++];
            }

            // Sub-array 1 is completed.
            else {
                mix[k++] = arr[j++];
            }
        }

        // Copying sorted elements in original array.
        for (int val : mix) {
            arr[start++] = val;
        }
        return;

    }
}