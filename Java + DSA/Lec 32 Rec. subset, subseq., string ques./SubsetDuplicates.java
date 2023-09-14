import java.util.ArrayList;
import java.util.Arrays;

public class SubsetDuplicates{

    public static void main(String[] args) {
        int[] array = {2, 1, 2};
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

        if (array.length==0) return finalList; // 'Empty set' is still a subset.
        
        // Sort the Array
        Arrays.sort(array);

        int pnum = array[0]; // to identify duplicates
        // For Loops
        for(int num:array){
            int n = finalList.size();
            for(int i=((pnum==num)?n/2:0); i<n; i++){
                ArrayList<Integer> internal = new ArrayList<Integer>(finalList.get(i));
                internal.add(num);
                finalList.add(internal);
            }

            pnum=num; 
        }
        
        return finalList;
        
    } 
}