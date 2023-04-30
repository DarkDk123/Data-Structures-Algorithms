import java.util.Arrays;

/**
 * Bubble Sort Algorithm.
 * aka Sinking sort, Exchange sort.
 * 
 * Stable Sorting Algorith: "A Sorting Algo which Maintains
 * the existing Order of Equal Elements"
 */
public class BubbleSort {
    public static void main(String[] args) {
        // Main Functioning

        int[] array_unsorted = { 2, 4, 51, 23, 10, 45, 84, -1, 32 };
        System.out.println("Array Before Sorting: " + Arrays.toString(array_unsorted));

        bubbleSortAlgo(array_unsorted); // Sorted by Bubble Sort.
        System.out.println("After Sorting: " + Arrays.toString(array_unsorted));
    }

    // Bubble Sort Algorithm to perform In-place Sort.
    static void bubbleSortAlgo(int[] Array) {

        for (int i = 0; i < Array.length; i++) {
            
            // check if array is already sorted at every pass.
            boolean sorted = true;
            // for loop from 0 to the last 2nd point array is unsorted.
            // Substracting extra 1 from "End" cause we don't need to check last
            // as it is checked in last 2nd Check condition.
            for (int j = 0; j < Array.length - (i + 1); j++) {
                // if next element is smaller than current
                if (Array[j] > Array[j + 1]) {

                    // Swaping
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;

                    sorted = false; // swapped means !sorted

                }
            }
            if (sorted) return ;
        }
    }
}
