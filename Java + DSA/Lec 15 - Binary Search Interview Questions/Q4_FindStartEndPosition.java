import java.util.Arrays;

/**
 * Q. Find Starting & Ending Position of a given target in the
 * Given Ascending Sorted Array of Numbers.
 * 
 * @return Return an Int Array i.e. [int, int].
 *         If Target Not Found returns [-1, -1].
 */
public class Q4_FindStartEndPosition {
    public static void main(String[] args) {
        // Main Functioning
        int[] array = {5, 7, 7, 7, 7, 8, 8, 10};
        int[] answer = solution(7, array);
        System.out.println(Arrays.toString(answer));

    }

    /**
     * @param target : Integer to be found.
     * @param nums   : Integer Array to Search in.
     * 
     * @return Returns an int array [x, y] i.e. x='first index' & y='last index' of
     *         the target.
     *         Returns [-1, -1] if target not found.
     * 
     */
    static int[] solution(int target, int[] nums) {
        // Empty Integer Array ('nums').
        if (nums.length == 0)
        return new int[] { -1, -1 };
        
        int start = 0, end=nums.length-1;
        int[] ans = new int[2];

        // Calling
        int result = recBinary(target, nums, start, end);
        if (result==-1) return new int[] {-1, -1}; // return [-1, -1] if not found!!

        // Found, now check for left array
        ans[0] = result;
        int left = result-1;
        if (left>=0)// Edge case correction (element at 0th index)
        while (nums[left]==target){
            ans[0] = recBinary(target, nums, start, left);
            left = ans[0]-1;
            
        }
        // Found, now check for right array
        ans[1] = result;
        int right = result+1;
        if (right<nums.length) // Edge Case Condition (element at last index)
        while (nums[right]==target){
            ans[1] = right = recBinary(target, nums, right, end);
            right = ans[1] + 1;
        }
        
        return ans;

    }

    // Binary Search with Recursion
    static int recBinary(int target, int[] nums, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return recBinary(target, nums, mid + 1, end);
            } else {
                return recBinary(target, nums, start, mid - 1);
            }
        }   
        else return -1;

    }
}
