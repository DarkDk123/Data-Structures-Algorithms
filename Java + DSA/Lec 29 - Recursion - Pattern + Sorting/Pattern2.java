/**
 * Q. Now Let's print a normal triangle, 
 *    Just by changing the previous code little, we can achieve this.
 * 
 *    *
 *    * *
 *    * * *
 *    * * * *
 * 
 *     Same as before, Just we switched function recall & print statement.
 *     Just to go and end the recursion first, then printing the pattern back.
 *     This helps to print the opposite triangle.
 */

public class Pattern2 {
    public static void main(String[] args) {
        printPatternRec(4, 1);
        System.out.println();
    }

    // Pattern using recursion.
    static void printPatternRec(int row, int col) {
        if (row == 0) return;

        if (col <= row) {
            // Switching this.
            printPatternRec(row, ++col);
            System.out.print("* ");
        } else {
            // And this.
            printPatternRec(row - 1, 1);
            System.out.println();
        }
    }
}