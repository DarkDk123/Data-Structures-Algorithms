import java.util.Arrays;

// Kunal's Solution for the Same Question.
public class Q4_FindStartEndPosition2 {
    public static void main(String[] args) {
        // Main Functioning
        int[] array = { -4, 5, 7, 7, 7, 7, 8, 8, 10 };
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
        int[] ans = new int[] { -1, -1 };
        // Empty Integer Array ('nums').
        if (nums.length == 0)
            return ans;

        int start = 0, end = nums.length - 1;

        ans[0] = recBinary(target, nums, start, end, true, -1);
        if (ans[0] != -1) {
            ans[1] = recBinary(target, nums, start, end, false, -1);

        }
        return ans;

    }

    // Binary Search with Recursion
    static int recBinary(int target, int[] nums, int start, int end, boolean findstart, int ans) { // ans as parameter to save answer state during recursion.
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (findstart){
                    return recBinary(target, nums, start, mid - 1, findstart, ans);
                } else {
                    return recBinary(target, nums, mid + 1, end, findstart, ans);
                }
            } else if (nums[mid] < target) {
                return recBinary(target, nums, mid + 1, end, findstart, ans);
            } else {
                return recBinary(target, nums, start, mid - 1, findstart, ans);
            }
        }
        // Returning Answer.
        return ans;

    }
}
