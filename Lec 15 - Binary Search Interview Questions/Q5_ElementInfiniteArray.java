/**
 * Q. Finding Position of an Element in an Infinite Sorted Array.
 */
public class Q5_ElementInfiniteArray {
    public static void main(String[] args) {
        // Main Functioning
        int[] array = {1, 2, 3 , 4, 5, 10 , 20, 30, 54, 60, 90};
        int result = solution(10, array);
        System.out.println(result);

    }

    /** Main Solution.
     * @param target - Target to find! : int.
     * @param array - Integer Array to Search in: int[].
     * @return - Returns the Index of the element else -1 if not found!
     */
    static int solution(int target, int[] array){
        // First Starting with 2 size box.
        int start=0, end = 1;

        // Determining start & end range of target.
        while (array[end] < target) {
            // Moving Start to 1 more than end. (Temp)
            int tempStart = end+1;
            // Doubling the box value.
            // end = previous end + (Size of the box*2)
            end = end + (end-start+1)*2;
            // Actual moving start to end+1
            start = tempStart;

        }
        // Calling the Binary Search on found start & "end".
        int result = BSearch(target, array, start, end);
        return result;
    }

    // Common Recursive Binary Search.
    static int BSearch(int target, int[] array, int start, int end){
        if ((start <= end) && array.length > end ) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target)
                return mid;
            else if (target < array[mid]) {
                    return BSearch(target, array, start, mid - 1);
            } else {
                    return BSearch(target, array, mid + 1, end);
            }
        }
        else
            return -1;
    }
}
