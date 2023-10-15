import java.util.ArrayList;

/**
 * Q. Find all the Subsets of a given array of Integers (Combinations) Iteratively.
 */

public class SubsetArrayIter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        ArrayList<ArrayList<Integer>> answer = subsetIter(array);

        // Print Answer List
        for(ArrayList<Integer> subset: answer){
            System.out.print(subset + ", ");
        }
        System.out.println();
    }

    
    // Iterative approach for Subsets.
    public static ArrayList<ArrayList<Integer>> subsetIter(int[] array){
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<ArrayList<Integer>>(); // Outer List
        finalList.add(new ArrayList<Integer>()); // Adding an Empty List.

        // For Loops
        for(int num:array){
            int n = finalList.size();
            for(int i=0; i<n; i++){
                ArrayList<Integer> internal = new ArrayList<Integer>(finalList.get(i));
                internal.add(num);
                finalList.add(internal);
            }
        }
        
        return finalList;
        
    }
}
