/**
 * Q. Finding the Ceiling of a Number in an Ascending Sorted array.
 */
public class Q1_CeilingOfaNumber {
    public static void main(String[] args) {
        // Main Functioning.
        int[] array = { -10, -5, 0, 1, 2, 3, 4, 5, 8, 45, 54, 65 };
        int target = 6;

        // Calling the Solution Method.
        int result = solution(target, array);
        System.out.println((result!=-1)?"Found at Index: "+result:"Not Found: Target is Greater than all the Array Elements.");
    }

    // Return Index of Ceiling of Integer
    // Ceiling is "Smallest Number >= target"
    static int solution(int target, int[] array) {
        
        // If Array is Empty.
        if (array.length==0) return -1;
        // If Target is Greatest than all the Array Elements.
        // Return -1
        if (target>array[array.length-1]) return -1;

        // If Target is smaller than the Gretest element of the Array.
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target)
                return mid;
            else if (target < array[mid]) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        
        // If Condition Breaks, start has the Ceiling value of Given Integer.
        return start;
    }
}
