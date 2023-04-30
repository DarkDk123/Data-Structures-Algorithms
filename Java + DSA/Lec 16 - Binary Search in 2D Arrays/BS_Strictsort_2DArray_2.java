import java.util.Arrays;

/**
 * "Same Question by Kunal Kushwah."
 * 
 * Implement Binary Search in a strictly sorted 2D Array.
 * Strictly Sorted i.e. -->
 * {
 * { 10, 20, 30, 40 },
 * { 50, 55, 60, 65 },
 * { 75, 80, 84, 87 },
 * { 89, 94, 97, 100 }
 * }
 * 
 * "I've done it with same Running Complexity and much more code simplicity
 *  Kunal's solution was complicated."
 */
public class BS_Strictsort_2DArray_2 {
    public static void main(String[] args) {
        // Main Functioning

        int[][] matrix = {
             { 10, 20, 30, 40 },
             { 50, 55, 60, 65 },
             { 75, 80, 84, 87 },
             { 89, 94, 97, 100 }
    };

    int[] answer = BinaryS_2d(45, matrix);
    System.out.println("Result is: " + Arrays.toString(answer));
}
    // Binary Search in Strictly Sorted 2D Arrays
    static int[] BinaryS_2d(int target, int[][] matrix){
        if (matrix.length==0) return new int[]{-1, -1}; //Empty!!
        int rows = matrix.length; // Total rows
        int cols = matrix[0].length; // Total columns

        if (matrix.length==1) return SearchBinary(target, matrix, 0, 0, cols-1); // If only 1 row is there.

        // Determining Row's Start, End & the Mid-Column.
        int rStart = 0;
        int rEnd = rows-1;
        int midCol = cols/2; // col/2 cause we aren't narrowing down the Columns.

        // Searching Until 2 rows remains.
        while (rStart<(rEnd-1)){// Until rStart<last_2nd row, "Will run untill 2 rows remains".
            int midRow = rStart + (rEnd-rStart)/2;

            if (matrix[midRow][midCol]==target) return new int[]{midRow, midCol};
            else if (matrix[midRow][midCol] < target) rStart = midRow;
            else rEnd = midRow;
        }
        // Now we've 2 rows remaining. (rStart, rEnd = 1st, 2nd row respectively)
        if (matrix[rStart][midCol]==target) return new int[]{rStart, midCol};
        else if (matrix[rEnd][midCol]==target) return new int[]{rEnd, midCol};
        
    // If Last 2 rows don't have target at middle column, 4 parts remains.
        // Search in 1st half
        if (matrix[rStart][midCol-1]>=target)
        return SearchBinary(target, matrix, rStart, 0, midCol-1);
        
        // Search in 2nd half
        if (matrix[rStart][midCol+1]<=target && target<=matrix[rStart][cols-1])
        return SearchBinary(target, matrix, rStart, midCol+1, cols-1);
        
        // Search in 3rd half
        if (matrix[rEnd][midCol-1]>=target)
        return SearchBinary(target, matrix, rEnd, 0, midCol-1);
        
        // Search in 4th half
        else  return SearchBinary(target, matrix, rEnd, midCol+1, cols-1);
    }

    // Binary Search for Individual rows. (in a row b/w provided columns).
    static int[] SearchBinary(int target, int[][] matrix, int row, int cStart, int cEnd) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (target == matrix[row][mid])
                return (new int[]{row, mid});
            else if (target > matrix[row][mid])
                cStart = mid + 1;
            else
                cEnd = mid - 1;
        }
        // Not Found!!
        return new int[]{-1, -1};
    }
}
