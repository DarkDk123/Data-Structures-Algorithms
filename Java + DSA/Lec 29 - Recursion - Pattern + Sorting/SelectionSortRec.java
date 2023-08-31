import java.util.Arrays;

/** 
 * Q. Implementing Selection Sort using Recursion.
 * 
 *  In this, we just take one element based on a property (Smallest or Largest)
 *  then, we place it to it's correct position (start or end) of the array.
 * 
 *  Here, we'll take the largest element, then will place it to the last of the array.
 *  Until we sorts the entire array.
 */

public class SelectionSortRec {
    public static void main(String[] args) {
        int[] array = {4, 51, 20, 10, 7, 7, 3};
        System.out.println("Before Sorting : " + Arrays.toString(array));
        selectionSort(array, 1, 1, 0);
        System.out.println("Before Sorting : " + Arrays.toString(array));

    }

    // Selection sort using Recursion
    public static void selectionSort(int[] arr, int pass, int index ,int maxIndex){
        // Base condition
        if (pass==arr.length) return;

        // Find the largest element
        if (index<=arr.length-pass){
            if (arr[index]>arr[maxIndex]){
                maxIndex = index;
            }
            selectionSort(arr, pass, ++index, maxIndex);
        }

        // Place the largest element to it's correct position (Last Index).
        else{
        swap(arr, maxIndex, arr.length-pass);

        // Recursion | Next Pass | Reset index & maxIndex
        selectionSort(arr, ++pass, 1, 0);
        }
    }

    // Swap Function
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
