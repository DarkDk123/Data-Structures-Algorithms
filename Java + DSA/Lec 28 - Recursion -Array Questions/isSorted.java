import java.util.Arrays;

/**
 * Q. Find given array is sorted or not via recursion.
 * 
 * There are two solution :
 * 
 * (1) I came up with comparing 0-th & 1-th element every time until ar.length==1.
 *      and at every recursion call slicing the array from 1-th to last position (omitting 0-th)
 *  
 *      It's Space Complexity is greater :- O(n^2)     
 * 
 * (2) Kunal gave solution of helper function, by having an index with original array, recursion runs
 *     until index==ar.length-1.
 */

public class isSorted{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 5};
        System.out.println("(1) The array is : " + ((solution1(array))?"Sorted":"Not Sorted."));
        System.out.println("(2) The array is : " + ((solution2(array))?"Sorted":"Not Sorted."));
    }

    // My solution | bad space complexity
    static boolean solution1(int[] array){
        if (array.length==1) return true;

        if (array[0]<=array[1]) return solution1(Arrays.copyOfRange(array, 1, array.length));
        return false;
    }

    // Kunal's Solution.
    static boolean solution2(int[] array){
        
        return s2_helper(array, 0);
    }

    static boolean s2_helper(int[] array, int index){
        if (index==array.length-1) return true;
        
        if (array[index]<= array[index+1]) return s2_helper(array, ++index);
        return false;
    }
}