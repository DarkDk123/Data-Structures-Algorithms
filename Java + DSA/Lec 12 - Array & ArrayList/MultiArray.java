import java.util.Arrays;

public class MultiArray {

    public static void main(String[] args) {
        // Creating 2D Arrays

        int[][] arr2d = {
                { 1, 2, 3 },
                { 4, 5, 3, 2 }, // Every Subarray can have variable no. of elements i.e. Columns.
                { 1, 2, 4, 85 }
        };

        // Can also create with below code (not necessary to provide column length in 2D
        // Array).
        // int[][] arr2d = new int[2][];

        // Looping over 2D arrays.
        System.out.println("\nLooped by for-i loops: \n");
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }
        // Looping by Enhanced ForEach Loops.
        System.out.println("\nLooped by for-Each loops: \n");
        for (int[] element : arr2d) {
            for (int element2 : element) {
                System.out.print(element2 + " ");
            }
            System.out.println();
        }

        // Just printing array by Array.toString() Method.
        // Can't use directly on 2D array.
        System.out.println("\nLooped with \"for-Each + Array.toString\" method\n");
        for (int[] sub_array : arr2d) {
            System.out.println(Arrays.toString(sub_array));
        }
    }
}
