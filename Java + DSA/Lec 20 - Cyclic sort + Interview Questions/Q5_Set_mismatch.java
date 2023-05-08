import java.util.Arrays;

/**
 * Q. Set Mismatch: You have a set of integers, which originally contains all the numbers from '1 to n'.
 *    Unfortunately due to some error, one number from range got duplicated resulting "Repetition of one Number
 *    & loss of another Number"
 * 
 *    "You are given this array after the loss, Return the 'duplicated Number & the missing Number' in the form of an array."
 * 
 * 
 */
public class Q5_Set_mismatch {
    public static void main(String[] args) {
        // Main Functioning
        int[] nums = {2, 1, 4, 3, 3 };
        System.out.println("Array Before Sorting: " + Arrays.toString(nums));
        System.out.println("\n\nMissing element is " + Arrays.toString(solution(nums)));
    }

    static int[] solution(int[] nums) {
        // Firstly sorting the array
        sortSet(nums);
        // looping sorted array, find element at wrong index.
        // that index will be the missing element.
        
        for (int index = 0; index < nums.length; index++) {
            if (index!=nums[index]-1) return new int[] {nums[index], index+1};
        }
        return new int[]{-1, -1};
    }

    // Method to Sort Array having [0, N] with a missing number.
    static void sortSet(int[] nums){
        int i = 0;
        while (i<nums.length){
            int correct = nums[i]-1;
            // Swap until current and correct position elements are same.
            if (nums[i]!=nums[correct]) swap(nums, i, correct);
            else i++;
        }
    }

    // Method to Swap two array elements.
    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
