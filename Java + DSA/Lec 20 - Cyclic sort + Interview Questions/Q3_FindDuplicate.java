/**
 * Q. Given an Array 'nums' containing n+1 integers in the range [1, n]
 * inclusive.
 * there is only 1 repeated no. in the array, | Return that repeated Number.
 * 
 * "Use constant extra
 * space."
 * 
 * "Note: This range [1, n] tells us to use Cyclic Sort."
 */

public class Q3_FindDuplicate {
    public static void main(String[] args) {
        // Main Functioning
        int[] nums = { 1, 3, 4, 2, 2 };
        System.out.println("Duplicate Number is " + solution(nums));

    }

    // Just Cyclic sort, but when before swaping
    // we checked that number at current index is already present
    // at the correct index, if yes then it's the answer (Duplicate Number).
    static int solution(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i]!=i+1){
                int correct = nums[i]-1;
                if (nums[i]==nums[correct]) return nums[i];
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        // If no duplicates found!!
        return -1;
    }

    // Method to Swap two array elements.
    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}