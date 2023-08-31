import java.util.Arrays;

/**
 * Q. Implementing Bubble Sort using Recursion.
 */

public class BubbleSortRec {
    public static void main(String[] args) {
        int[] array = {21, 100, 10, 9, 23, 21, 12, 6, 27, 7};
        System.out.println("Before Sorting : " + Arrays.toString(array));
        bubbleSort(array, 0, 1);
        System.out.println("After Sorting : " + Arrays.toString(array));
    }

    // Recursive Bubble sort
    public static void bubbleSort(int[] arr, int pass, int sort_index) {
        // Base Condition
        if (pass == arr.length-1) return;

        // Like Inner Loop
        if (sort_index <= arr.length-1-pass){
            if (arr[sort_index-1]>arr[sort_index]){
                swap(arr, sort_index-1, sort_index);
            }
            
            bubbleSort(arr, pass, ++sort_index); // Check Next
        }

        // Next Pass | Like Outer Loop
        bubbleSort(arr, ++pass, 1);

    }

    // Swap Function
    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
