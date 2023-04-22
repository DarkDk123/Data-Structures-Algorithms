/**
 * Q. Given an Array 'num' consisting non-negative integers and an integer 'm'
 * divide the Array into 'm' non-empty continuous subArrays in such a way
 * that Minimizes the largest sum among these 'm' subArrays.
 */

public class Q10_SplitArrayLargeSum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5};
        int m = 2;
        int minLargestSum = solution(array, m);

        System.out.println(minLargestSum);

    }

    static int solution(int[] array, int splits) {
        int start = 0, end = 0; // Here start & end will show min & max sum that a subArray can have.

        // Assign Maximum element as start.
        for (int ele : array) {
            start = Math.max(start, ele);// This loop will store array's maximum element in Start.
            end += ele; // Assigning Sum of elements as End.
        }

        // Now that we have know start and end of the sum.
        // Implementing Binary Search as the Sum of the subArrays.
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Find no. of pieces in which we can divide this array to get mid as Max Sum.
            int pieces_count = 1, sum = 0;
            for (int element : array) {
                sum += element;
                if (sum > mid) {
                    // sum > mid means you can't add to this subArray
                    // sum=element means starting sum from newer subArray.
                    pieces_count++;
                    sum = element;
                }
            }

            // If found-pieces<=splits, totalSum would be this or less than this current sum.
            if (pieces_count<=splits) end = mid;
            else start = mid+1; // else totalSum would be Large than current.
        }

        // If start==end, then both points to Minimized Largest Sum of subArrays.
        return start;
    }
}
