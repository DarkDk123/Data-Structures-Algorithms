public class Pattern10 {
    public static void main(String[] args) {
        NumberSquare(5);
    }

    /** Pattern 10: NumberSquare
     *  
     *      "   5 5 5 5 5 5 5 5 5 
     *          5 4 4 4 4 4 4 4 5 
     *          5 4 3 3 3 3 3 4 5 
     *          5 4 3 2 2 2 3 4 5 
     *          5 4 3 2 1 2 3 4 5 
     *          5 4 3 2 2 2 3 4 5 
     *          5 4 3 3 3 3 3 4 5 
     *          5 4 4 4 4 4 4 4 5 
     *          5 5 5 5 5 5 5 5 5  "
     * 
     */
    static void NumberSquare(int n){
        int totalRowCol = (2 * n);
        for (int row = 1; row < totalRowCol; row++) {
            for (int col = 1; col < totalRowCol; col++) {

                // Main catch is to find what to print here!!
                // So simple, it's just the minimum of all the distances b/w Current Cell & All
                // the four Borders of Square. (I was unable to find that!!)
                int toPrint = n - min(col, row, totalRowCol-col, totalRowCol-row)+1;

                System.out.print(toPrint + " ");
            }
            System.out.println();
        }
    }

    // Method to find Minimum of Integers
    static int min(int ...walls){
        int ans = walls[0];
        for (int ele : walls) if (ele<ans) ans = ele;
        return ans;
    }
}
