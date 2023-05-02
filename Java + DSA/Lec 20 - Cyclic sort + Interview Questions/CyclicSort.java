import java.util.Arrays;

/**
 * Cyclic Sort.
 * 
 * "It Works on Arrays having unsorted elements 1 to N"
 * 
 * "Catch: In a Sorted array having numbers 1 to N,
 *  Every element will have it's (index == value - 1)"
 */

public class CyclicSort {
    public static void main(String[] args) {
        // Main Function
        int[] array = { 4, 5, 2, 1, 3, 8, 6, 7, 15, 10, 9, 13, 14 ,12, 11};
        System.out.println("Array Before Sorting: " + Arrays.toString(array));
        cyclicSort(array);
        System.out.println("After Sorting: " + Arrays.toString(array));

    }

    // Cyclic sort by kunal
    static void cyclicSort(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            int correct_index = array[i] - 1;
            if (i != correct_index) {
                swap(array, i, correct_index);
            } else {
                i++;
            }
        }
    }

    // Cyclic sort implemented by me.
    static void mcyclicSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // Can't store correct_index in a variable.
            // Cause we have to do it for multiple values.
            while (array[i] != array[array[i]-1]) {
                swap(array, i, array[i]-1);
            }
        }

    }

    // Swap Function to Swap two array values.
    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
