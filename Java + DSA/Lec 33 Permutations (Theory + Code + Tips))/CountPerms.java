/**
 * Q. Count the Total number of Permutations with recursion.
 *      (Use same approach as for Permutations)
 * 
 *       We can do it with Formula (n!), but still do it with Recursion.
 * 
 */
public class CountPerms {
    public static void main(String[] args) {
        String test = "abc2";
        int count = countPermutations("", test);
        System.out.println("Total Count is : " + count);
    }

    public static int countPermutations(String perm, String original){
        if (original.isEmpty()){
            return 1;
        } 

        int permutations = 0;

        for(int i=0; i<=perm.length(); i++){
            String tempPerm = perm.substring(0, i) + original.charAt(0) + perm.substring(i);
            permutations += countPermutations(tempPerm, original.substring(1));
        }
        
        return permutations;
    }
    
}
