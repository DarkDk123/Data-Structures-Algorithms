/**
 * Q. Find all the factors of number 'n'.
 * 
 *  Solu(1) : BruteForce, use a ForLoop from 1 to n, print each
 *            number that divides 'n' completely.  | Time Complexity -> O(n). | Constant Space Complexity.
 * 
 *  Solu(2) : We have a repeating pattern. So run the loop only from 1 to sqrt(n).
 *            every 'i' that divides 'n' results into another factor i.e. 'n/i'.
 *          
 *          "Just Added Some Preety Printing Techniques."
 *  
 *     ->   Time & Space Complexity -> O(sqrt(n))
 */

import java.util.ArrayList;
public class factorOfNumber {
    public static void main(String[] args) {
        int n = 45;    
        System.out.printf("Factors of %d are : ", n);
        findFactors(n);
    }


    static void findFactors(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();

        System.out.print("[");
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0){
                System.out.print(i + ", ");
                
                if (n/i!=i) factors.add(n/i);
            }
        }
    
        for (int i = factors.size()-1; i > 0; i--) {
            System.out.print(factors.get(i) + ", ");
        }

        System.out.print(factors.get(0) + "] \n");
        return;
    }
}
