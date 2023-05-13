class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);

    }
    
    /** Pattern 6: 
     *    "        *
     *            * *
     *           * * *
     *          * * * * 
     *         * * * * *
     *          * * * *
     *           * * *
     *            * *
     *             *   "
     * 
     */
    static void pattern6(int input) {
        // We can see that here, "rows==(input*2)-1"
        for (int row = 1; row <= ((input * 2) - 1); row++) {

            // Determining no. of columns.s
            // columns = row untill row>input then (2*input-1)
            int totalColumns = (row <= input) ? row : ((2 * input) - row);

            // int spaces =(row <= input)?(input - row):(row - input); // My Solution -> Complex!

            // Kunal's idea for calculating spaces.
            int spaces = input - totalColumns;

            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColumns; col++) {
                System.out.print("* ");
            }
            // New Line.
            System.out.println();

        }
    }
}