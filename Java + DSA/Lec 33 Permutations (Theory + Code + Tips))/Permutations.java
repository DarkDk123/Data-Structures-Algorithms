import java.util.ArrayList;

public class Permutations{
    public static void main(String[] args) {
        String test = "abc";
        ArrayList<String> ans = permuRecRet("", test);
        // Print Permutation.
        System.out.println(ans);
    }

    // Just Printing distinct Permutations.
    public static void permuRec(String perm, String original){
        if (original.isEmpty()){
            System.out.print(perm + ", ");
            return;
        } 

        for(int i=0; i<=perm.length(); i++){
            String tempPerm = perm.substring(0, i) + original.charAt(0) + perm.substring(i);
            permuRec(tempPerm, original.substring(1));
        }

    }

    // Returning an ArrayList

    public static ArrayList<String> permuRecRet(String perm, String original){
        if (original.isEmpty()){
            ArrayList<String> permutations  = new ArrayList<>();
            permutations.add(perm);
            return permutations;
        } 

        ArrayList<String> permutations = new ArrayList<>();

        for(int i=0; i<=perm.length(); i++){
            String tempPerm = perm.substring(0, i) + original.charAt(0) + perm.substring(i);
            permutations.addAll(permuRecRet(tempPerm, original.substring(1)));
        }
        
        return permutations;
    }
}