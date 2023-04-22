/**
 * Q. Find the Number of rotations in a rotated sorted array.
 * 
 * "As we know how to find Pivot element, the pivotIndex+1
 * will be the number of rotations."
 */
public class Q9_RotationCount {
    public static void main(String[] args) {
        // Main Functioning
        int[] rotatedArray = {5, 6, 7, 1, 2, 3};
        int result = rotationCount(rotatedArray);
         // Increamented Pivot to print rotation Count.
        System.out.println(++result);
    }

    // Method to Find Pivot in a Rotated Array.
    static int rotationCount(int[] rotatedArray){
        if (rotatedArray.length == 1)
            return 0;
        int start = 0;
        int end = rotatedArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < rotatedArray.length - 1 && (rotatedArray[mid] > rotatedArray[mid + 1]))
                return mid;
            else if (rotatedArray[mid] >= rotatedArray[0])
                start = mid + 1;
            else
                end = mid - 1;

        }

        return -1;
    }

}
