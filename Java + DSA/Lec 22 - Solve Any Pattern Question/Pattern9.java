public class Pattern9 {
    public static void main(String[] args) {
        solution(4);

    }

    /**
     * Pattern 9:
     * 
     *    "             1 
     *                2 1 2 
     *              3 2 1 2 3 
     *            4 3 2 1 2 3 4 
     *          5 4 3 2 1 2 3 4 5 
     *            4 3 2 1 2 3 4 
     *              3 2 1 2 3 
     *                2 1 2 
     *                  1           "
     * 
     * 
     */
    static void solution(int n) {
        // If any Pattern has numbers as columns relating to rows,
        // We should use loop starting from "1" to "destination".
        for (int row = 1; row <= (n * 2 - 1); row++) {

            int spaces = Math.abs(n - row); // Can be "n-cols" if "cols" has defined above.
            for (int space = 0; space < spaces; space++) {
                System.out.print("  ");
            }

            int cols = (row > n) ? (2 * n) - row : row;
            for (int col = cols; col > 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 1; col <= cols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
