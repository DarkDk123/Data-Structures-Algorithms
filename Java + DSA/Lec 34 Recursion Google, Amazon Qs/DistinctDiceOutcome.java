import java.util.*;

/**
 * Q. Modification of Previous Solution to get all the Combinations instead of Permutations.
 * 
 */

public class DistinctDiceOutcome{
    public static void main(String[] args) {
        // printCombs("", 2);
        List<String> ans = CombsReturn("", 4);
        
        System.out.println(ans);
    }

    // Returning an ArrayList.
    public static List<String> CombsReturn(String cmb, int target){
         if (target==0){
            List<String> ans = new ArrayList<String>();
            ans.add(cmb);
            return ans;
        }

        List<String> ans = new ArrayList<String>();
        int s = 1;
        if (!cmb.isEmpty()) s = Integer.parseInt(String.valueOf(cmb.charAt(cmb.length()-1)));
        for(int i=s; i<=6 && i<=target; i++){
            ans.addAll(CombsReturn(cmb+i, target-i));
        }
        
        return ans;
    }

}
