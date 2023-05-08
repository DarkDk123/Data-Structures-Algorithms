import java.util.Arrays;

/**
 * Q. Given an Unsorted Integer Array 'nums', return the 'Smallest missing positive integer'.
 *    Note: "You Must Implement an Algorithm that run in 'O(n)' time & used constant extra space."
 * 
 *    "Here O(n) complexity shows us to use 'Cyclic Sort' approach."
 * 
 * 
 */
public class Q6_FirstMissingPositive {
    public static void main(String[] args) {
        // Main Functioning
        int[] nums = {1, 2, 4};
        System.out.println("Array Before Sorting: " + Arrays.toString(nums));
        System.out.println("Smallest Missing (+)ve Integer is: " + solution(nums));
        System.out.println("\n\nMissing element is " + Arrays.toString(nums));
    }

    static int solution(int[] nums){
        // Sorting the Array.
        sortArray(nums);

        for (int index = 0; index < nums.length; index++) {
            // Return the first element that isn't equal "index+1".
            if (nums[index]!=index+1) return index+1;
        }
        // If Array has all [1, n] elements, then 'n+1' is Smallest +ve Integer.
        return nums.length+1;

    }
    // Method to Sort Array.
    static void sortArray(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            // Checking (1) Number >= Length | (2) Number = (+)ve | (3) Number != index+1;
            if (nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else
                i++;
        }
    }

    // Method to Swap two array elements.
    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
