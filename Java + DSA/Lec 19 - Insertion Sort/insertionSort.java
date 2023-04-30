import java.util.Arrays;

/**
 * Insertion Sort.
 * 
 * "It's adaptive: no. of comparisons can be reduced on checks"
 * 
 * "Mainly used in other sort algos for large data.
 *  and for Partially sorted Data Structures."
 * 
 * Stable Sorting Algorith: "A Sorting Algo which Maintains
 * the existing Order of Equal Elements"
 */
public class insertionSort {
    public static void main(String[] args) {
        // Main Functioning
        int[] array = {4, 5 , 1, 23, 1, 21, 45, 71, 2};
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        insertSort(array);
        System.out.println("Array after Sorting: " + Arrays.toString(array));

    } 

    static void insertSort(int[] array){ 
        // First for-loop to keep track of Index. (0 to last_second Index)
        for (int i = 0; i < array.length-1; i++) {
            // This will run reverse from  i+1 to 1 | (comparing j with j-1)
            for (int j = i+1; j > 0; j--) {
                if (array[j]<array[j-1]) swap(array, j, j-1); // Swap
                else break; // Else left side is already sorted (breaking the inner loop.)
            }
        }


    }

    // Method to Swap to array elements.
    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
