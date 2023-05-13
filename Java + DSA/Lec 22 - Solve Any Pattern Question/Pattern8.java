// In real, there are plenty of these patterns,
// it's hard to do all of them.
// I've done only interesting ones, and named it sequencially.

public class Pattern8 {
    public static void main(String[] args) {
        solution(5);
        
    }

    /** Pattern 8:
     * 
     *    "      1 
     *         2 1 2 
     *       3 2 1 2 3 
     *     4 3 2 1 2 3 4 
     *   5 4 3 2 1 2 3 4 5   "
     * 
     * 
     */
    static void solution(int n){
        // If any Pattern has numbers as columns relating to rows,
        // We should use loop starting from "1" to "destination".
        for (int row = 1; row <= n; row++) {
            int spaces = n-row;
            for (int space = 0; space < spaces; space++) {
                System.out.print("  ");
            }

            for (int col = row; col > 1; col--) {
                System.out.print(col + " ");                
            }
         
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");                
            }
            System.out.println();
        }
    }
    
}
