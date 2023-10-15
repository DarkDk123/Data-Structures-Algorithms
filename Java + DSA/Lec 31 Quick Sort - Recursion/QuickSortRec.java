/**
 * Q. Implementing QuickSort Using Recursion.
 * 
 *    I found the partition method pretty hard, it took me a lot of Time.
 *    Specially when i was taking middle element as pivot.
 *    Somehow it's solution is Found & Understood by me.
 */

import java.util.Arrays;

public class QuickSortRec {
    public static void main(String[] args) {
        int[] array = {45, 21, 14, 27, 7, 12};
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIdx = partition(array, low, high);
            quickSort(array, low, pivotIdx - 1);
            quickSort(array, pivotIdx + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivotIdx = (low + high) / 2;
        int pivotValue = array[pivotIdx];
        
        // Swap pivot element to the end
        swap(array, pivotIdx, high);
        
        int i = low;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivotValue) {
                swap(array, i, j);
                i++;
            }
        }
        
        // Swap pivot element back to its correct position
        swap(array, i, high);
        
        return i;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
