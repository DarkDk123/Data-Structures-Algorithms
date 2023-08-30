/**
 * Q. we have to print the following pattern using recursion.
 *      
 *      * * * *     
 *      * * *   (n=4)
 *      * * 
 *      * 
 *
 *  We will find the relation b/w rows & columns to implement.
 *      Here, row_index = x to 1
 *            col_index = 1 to x
 *      Relation, 
 *            Starts in Each row = row_index
 */

public class Pattern1 {
    public static void main(String[] args) {
        // printPattern(4);

        printPatternRec(4, 1); // recursive method.
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // Pattern using recursion
    static void printPatternRec(int row, int col) {
        if (row == 0)
            return;

        if (col <= row) {
            System.out.print("* ");
            printPatternRec(row, ++col);
        } else {
            System.out.println();
            printPatternRec(row - 1, 1);
        }
    }
}
