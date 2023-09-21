import java.util.*;

/**
 * Q. Amazon Question: Find all the ways to form a sum "4" on a number of throws of one die. (All Permutations)
 * 
 */

public class DiceOutcome{
    public static void main(String[] args) {
        // printCombs("", 2);
        List<String> ans = CombsReturn("", 4);
        
        System.out.println(ans);
    }

    // Printing the ways
    public static void printCombs(String cmb, int target){
        if (target==0){
            System.out.println(cmb);
            return;
        }

        for(int i=1; i<7 && i<=target; i++){
            printCombs(cmb+i, target-i);
        }
    }

    // Returning an ArrayList.
    public static List<String> CombsReturn(String cmb, int target){
         if (target==0){
            List<String> ans = new ArrayList<String>();
            ans.add(cmb);
            return ans;
        }

        List<String> ans = new ArrayList<String>();
        
        for(int i=1; i<=6 && i<=target; i++){
            ans.addAll(CombsReturn(cmb+i, target-i));
        }
        
        return ans;
    }

}