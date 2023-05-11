/**
 * "All you have to know about patterns & approaches to solve them."
 * 
 * *Important Points to be noted: *
 * (1) Try to view the patterns as (Rows & Columns), run (outer, inner) loop
 *     acc. to (rows, columns).
 * 
 * (2) Identify No. of Columns in each different row & Type of Elements in them.
 * (3) Determine, What do you need to Print?
 * 
 */
public class PatternsApproach {
    public static void main(String[] args) {
        // Main Functioning.
        Pattern1(5);

    }

    /*  : Create the following pattern
    *
    *          "*
    *           **           
    *           ***
    *           ****
    *           *****"
    * 
    */
    static void Pattern1(int input){
        for (int row = 1; row <= input; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            // Row Completed, add a new line to Output.
            System.out.println();
        }
        
    }
}
