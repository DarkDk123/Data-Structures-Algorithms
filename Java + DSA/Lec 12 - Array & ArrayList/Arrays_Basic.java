import java.util.Arrays;
public class Arrays_Basic {
    public static void main(String[] args) {
    // Arrays
    // Syntax --> datatype[] name = new datatype[rrays, such as allocating multi-dimensional arrays in a non-contiguous manner to improve cache locality and reduce memory fragmentation. These optimizations size]; or {1,2,..}

        int[] array; // Just declaring the int array's reference var. (created in the Stack)
        array = new int[5]; // This creates and assigns an actual array object in the heap.

    // Initializing with value (Can't Use {} to declare array here.)
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        };

        System.out.println("Array 1: " + Arrays.toString(array));

    // Can Create and Initialize an array in the same line:
        int[] s_array = {2, 4, 5};
        System.out.println("Array 2: " + Arrays.toString(s_array));

    }
}
