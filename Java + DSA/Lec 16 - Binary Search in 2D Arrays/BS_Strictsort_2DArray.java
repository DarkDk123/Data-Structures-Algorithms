import java.util.Arrays;

/**
 * Implement Binary Search in a strictly sorted 2D Array.
 * Strictly Sorted i.e. -->
 * {
 * { 10, 20, 30, 40 },
 * { 50, 55, 60, 65 },
 * { 75, 80, 84, 87 },
 * { 89, 94, 97, 100 }
 * }
 */

public class BS_Strictsort_2DArray {
    public static void main(String[] args) {
        // Main Functioning

        int[][] matrix = {
             { 10, 20, 30, 40 },
             { 50, 55, 60, 65 },
             { 75, 80, 84, 87 },
             { 89, 94, 97, 100 }
    };

    int[] answer = BinaryS_2d(56, matrix);
    System.out.println("Result is: " + Arrays.toString(answer));
}
    // Binary Search in Strictly Sorted 2D Arrays
    static int[] BinaryS_2d(int target, int[][] matrix){

        int row=0, rowEnd= matrix.length-1;

        while(row<=rowEnd){
            int mid = row+(rowEnd - row)/2;
            int[] array1D = matrix[mid];
            if (array1D[0]<=target && array1D[array1D.length-1]>=target){
                int ans = SearchBinary(target, array1D);
                if (ans!=-1) return new int[]{mid, ans};
                else return new int[] {-1, -1};
            }
            else if(array1D[0]>target) rowEnd = mid-1; // Another if in case above if fails to return answer.
            else row = mid + 1;
        }
        return new int[]{-1, -1};

    }

    // Binary Search for Individual Arrays.
    static int SearchBinary(int key, int[] array) {
        int start = 0;
        int end = array.length - 1;

        // loop won't start if array is Empty i.e. (0<-1=false)
        while (start <= end) {
            /*
             * Using this cause same mathematical answer but calculates mid by substraction
             * instead addition ((s+e)/2) to reduce the risk of int overflow.
             */
            int mid = start + (end - start) / 2;// (start + end) / 2;
            if (key == array[mid])
                return mid;
            else if (key > array[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
