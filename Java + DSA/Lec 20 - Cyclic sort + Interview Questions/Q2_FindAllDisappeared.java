import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Q_2 Find all the disappeared numbers from an array of range [1, N].
 * 
 * Same as previous question, just have multiple missing elements.
 * 
 */
public class Q2_FindAllDisappeared {
    public static void main(String[] args) {
        // Main Functioning
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Array Before Sorting: " + Arrays.toString(nums));
        
        System.out.println("\n\nMissing elements are: " + solution(nums));
    }

    // Main Solution

    /**
     * 
     * @param nums :An Array having [1, N] with some missing values.
     * @return : An Int List of all the missing values
     */
    static List<Integer> solution(int[] nums) {
        // Sort missing
        sortMissing(nums);
        // Max Element of Array.
        List<Integer> answer = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (index!=nums[index]-1) answer.add(index+1);
        }
        return answer;

    }


    // Method to Sort Array having [1, N] integers with multiple missing numbers.
    // Uses Cyclic Sort.
    static void sortMissing(int[] nums) {
        // Loop through each element
        for (int index = 0; index < nums.length; index++) {
            // while loop when element isn't at correct pos. & element!=array.length
            while (index != nums[index] && nums[index] <= nums.length) {
                // If elements're same at the correct & corrent place.
                int correct_pos = nums[index] - 1;
                if (nums[index] == nums[correct_pos])
                    break;
                swap(nums, index, correct_pos);
            }
        }
    }
    // Kunal Kushwah's solution for Sorting.
    static void sortMissing2(int[] nums){
        int i = 0;
        while (i<nums.length){
            int correct = nums[i]-1;
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
