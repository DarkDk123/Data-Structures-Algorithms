import java.util.Arrays;

/**
 * Selection Sort Algorithm.
 * 
 * "Selects Each element & places it at 
 *  it's correct position until the array is sorted."
 * 
 * "Here i have selected Max and placed it at last index in a for loop"
 * 
 * It's a in-place Algorithm.
 */
public class SelectionSort {
    public static void main(String[] args) {
        // Main Functioning

        int[] array = {4, 51, 21, 4, 32, 65, 95, 75, 15};
        System.out.println("Array before Sorting: " + Arrays.toString(array));
        selectSort(array);
        System.out.println("Array before Sorting: " + Arrays.toString(array));
    }
    

    // Selection Sort

    static void selectSort(int[] array){
        // Looping to Every element
        for (int i = 0; i < array.length; i++) {
            int last = (array.length-1)-i;
            int maxI = maxIndex(array, 0, last);

            // Swapping last applicable value with max value.
            int temp = array[last];
            array[last] = array[maxI];
            array[maxI] = temp;
        }
    }

    // Method for Max Index.
    static int maxIndex(int[] array, int start, int end){
        int max = start; // Letting Start as the Max index firstly
        for (int i = start; i <=end; i++) {
            if (array[i] > array[max]) {
                max = i;
        }
    }
        return max;

    }
}
