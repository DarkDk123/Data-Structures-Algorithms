
/**
 * Q. Finding the Floor of a Number in an Ascending Sorted array.
 */
public class Q2_FloorOfaNumber {
    public static void main(String[] args) {
        // Main Functioning.
        int[] array = { -10, -5, 0, 1, 2, 3, 4, 5, 8, 45, 54, 65 };
        int target = 7;

        // Calling the Solution Method.
        int result = solution(target, array);
        System.out.println((result!=-1)?"Found at "+result:"Not Found: Target is Smaller than all the Array Elements.");
    }

    // Return Index of Floor of Integer
    // Floor is "Biggest Number <= target"
    static int solution(int target, int[] array) {
        //If Array is Empty!
        if (array.length==0) return -1;
        // If Target is Smallest than all the Array Elements.
        // Return -1
        if (target<array[0]) return -1;

        // If Target is bigger than the smallest element of the Array.
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
        
        // If Condition Breaks, end has the floor value of Given Integer.
        return end;
    }
}
