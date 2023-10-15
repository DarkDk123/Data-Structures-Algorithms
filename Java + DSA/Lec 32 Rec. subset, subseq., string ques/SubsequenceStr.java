import java.util.ArrayList;

/**
 * Q. Get all the different Combinations of a given String.
 */

public class SubsequenceStr {
    public static void main(String[] args) {
        System.out.println(subseq3("abc", ""));
    }

    // Printing Directly
    public static void subseq(String original, String sub){
        
        if (original.isEmpty()){
            System.out.print(sub + " ");
            return;
        }

        subseq(original.substring(1), sub+original.charAt(0));
        subseq(original.substring(1), sub);
    }

    // Get all the combinations in an ArrayList. (Referencing to the same obj in all calls)
    public static ArrayList<String> subseq_List(String original, String sub, ArrayList<String> ans){
        if (original.isEmpty()){
            if (!sub.isEmpty()) ans.add(sub);
            return ans;
        }
        
        subseq_List(original.substring(1), sub+original.charAt(0), ans);
        subseq_List(original.substring(1), sub, ans);
        return ans;
    }

    // Returns ArrayList while ArrayList isn't in the Args List.
    public static ArrayList<String> subseq3(String original, String sub){
        if (original.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            if (!sub.isEmpty()) list.add(sub);
            return list;
        }

        ArrayList<String> leftTree = subseq3(original.substring(1), sub + original.charAt(0));
        ArrayList<String> rightTree = subseq3(original.substring(1), sub);
                
        leftTree.addAll(rightTree);
        return leftTree;
    }
}
