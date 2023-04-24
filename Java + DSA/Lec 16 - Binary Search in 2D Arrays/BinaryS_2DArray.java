
/**
 * Implement Binary Search in a 2D Array.
 * Sorted Row-Column Wise i.e. --> 
 *         {
 *          { 10, 20, 30, 40 },
 *          { 15, 25, 35, 45 },
 *          { 28, 29, 37, 49 },
 *          { 33, 34, 38, 50 }
 *        }
 * 
 *  "Works for n*m matrices"
 */ 

import java.util.Arrays;

public class BinaryS_2DArray {
    public static void main(String[] paramArrayOfString) {
        int[][] array2d = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };

        int[] answer = Search2DArray(50, array2d);
        System.out.println(Arrays.toString(answer));
    }

    // Binary Search in 2D Arrays.
    // 
    static int[] Search2DArray(int target, int[][] array2d) {
        int row = 0;
        int column = array2d.length - 1;
        while ((row < array2d.length) && (column >= 0)) {
            if (array2d[row][column] == target) {
                return new int[] { row, column };
            }
            if (array2d[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[] { -1, -1 };
    }
}