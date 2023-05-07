import java.util.ArrayList;
import java.util.List;

/**
 * Q. Given an Array 'nums' of length 'n' in the range [1, n] inclusive.
 * each ineger appears once or twice | Return an array of integers that appeared
 * twice.
 * 
 * "Use constant extra
 * space."
 * 
 * "Note: This range [1, n] tells us to use Cyclic Sort."
 */

public class Q4_FindAllDuplicates {
    public static void main(String[] args) {
        // Main Functioning
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Duplicate Number is " + solution(nums));

    }

    // Solution: all the elements that are at the wrong index in 
    // the sorted array are duplicated.
    static List<Integer> solution(int[] nums){
        List<Integer> answer = new ArrayList<>();
        sortArrayDuplicates(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1) answer.add(nums[i]);
        }
        return answer;

    }

    // Method to sort the Array with multiple duplicates.
    static void sortArrayDuplicates(int[] nums){
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