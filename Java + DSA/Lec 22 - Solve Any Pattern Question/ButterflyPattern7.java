public class ButterflyPattern7{
    public static void main(String[] args) {
        butterFly(5);

    }


    /**
    *     "  *        *
    *        **      **
    *        ***    ***
    *        ****  ****
    *        **********
    *        ****  ****
    *        ***    ***
    *        **      **
    *        *        *   "
    * 
    */
    static void butterFly(int n){
        // Loop for Rows
        for (int row = 1; row <= ((2*n)-1); row++) {
            int spaces = Math.abs(2*(n-row)); String s = ""; 
            int cols = (row>n)?2*(2*n-row):2*row;

            for (int space = 1; space <= spaces; space++) {
                s+= " ";
            }
            
            // Columns.
            for (int col = 1; col <= cols/2; col++) {
                System.out.print("*");
            }
            // Space Printing
            System.out.print(s);

            // Remaining Columns.
            for (int col = 1; col <= cols/2; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}