import java.util.Arrays;

/**
 * Q. Given an Array 'nums' containing n distinct numbers in the range [0, n],
 *    return the only number that is missing from the Range.
 * 
 *  "You have to solve this with a Space Complexity: O(1) & Time Complexity: O(N)"
 * 
 *  "Note: This range [0, n], Complexity: O(N) tells us to use Cyclic Sort."
 */

public class Q1_MissingNumber {
    public static void main(String[] args) {
        // Main Functioning
        int[] nums = { 2, 4, 0, 3, 1, 15, 13, 11, 10, 5, 7, 9, 6, 8, 12};
        System.out.println("Array Before Sorting: " + Arrays.toString(nums));
        System.out.println("\n\nMissing element is " + solution(nums));
    }

    // We've range from [0, N] that means after sorting the array,
    // Every Element will have index same as it's value.

    // Now About Sorting the Array, we know that one No. is missing.
    // So we'll loop through each element, at any time we are unable
    // to find the correct index for an element just jump to the next index.
    
    // In Sorted Array, if any index don't have a correct value i.e. (index!=array[index])
    // // So, that value (index value) is missing from the array.


    static int solution(int[] nums) {
        // Firstly sorting the array, ignoring elements equal to array.length
        sortMissing(nums);
        // looping sorted array, find element at wrong index.
        // that index will be the missing element.
        for (int index = 0; index < nums.length; index++) {
            if (index!=nums[index]) return index;
        }
        return nums.length;
    }

    // Method to Sort Array having [0, N] with a missing number.
    static void sortMissing(int[] nums) {
        // Loop through each element
        for (int index = 0; index < nums.length; index++) {
            // while loop when element isn't at correct pos. & element!=array.length
            while (index != nums[index] && nums[index] != nums.length) { 
                swap(nums, index, nums[index]);
            }
        }

    }

    // Kunal's Solution for Sorting.
    static void sortMissing2(int[] nums){
        int i = 0;
        while (i<nums.length){
            int correct = nums[i];
            if (correct<nums.length && nums[i]!=nums[correct]) swap(nums, i, correct);
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
