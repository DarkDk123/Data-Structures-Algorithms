/**
 * "All you have to know about patterns & approaches to solve them."
 * 
 * *Important Points to be noted: *
 * (1) Try to view the patterns as (Rows & Columns), run (outer, inner) loop
 * acc. to (rows, columns).
 * 
 * (2) Identify No. of Columns in each different row & Type of Elements in them.
 * (3) Determine, What do you need to Print?
 * 
 */
public class PatternsApproach {
    public static void main(String[] args) {
        // Main Functioning.
        Pattern1(5);
        System.out.println("\n\n");
        Pattern2(5);
        System.out.println("\n\n");
        Pattern3(5);
        System.out.println("\n\n");
        Pattern4(5);
        System.out.println("\n\n");
    }

    /*
     * : Create the following pattern
     *
     * "*
     *  **
     *  ***
     *  ****
     *  *****"
     * 
     */
    static void Pattern1(int input) {
        for (int row = 1; row <= input; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            // Row Completed, add a new line to Output.
            System.out.println();
        }

    }

    /*
     * : Pattern 2: Create the following pattern
     *
     * "*****
     *  *****
     *  *****
     *  *****
     *  *****" 
     * 
     * "Rows & Columns are equal to input (n)"
     */
    static void Pattern2(int input){
        for (int row = 0; row < input; row++) {
            for (int col = 0; col < input; col++) {
                System.out.print("* ");
            }   
            // New Line
            System.out.println();
        }
    }

    /*
     * : Pattern 3: Create the following pattern
     *
     * "*****
     *  ****
     *  ***
     *  **
     *  *" 
     * 
     */
    static void Pattern3(int input){
        for (int row = 0; row < input; row++) {
            for (int col = row; col < input; col++) {
                System.out.print("* ");
            }
            // New Line.
            System.out.println();
        }

    }

    
    /*
     * : Pattern 4: Create the following pattern
     *
     *  
     * " 1
     *   12
     *   123
     *   1234
     *   12345
     *  " 
     * 
     * "Rows & Columns are equal to input (n)"
     */
    static void Pattern4(int input){
        for (int row = 1; row <= input; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " "); // Actually printing the Column Number itself.
            }   
            // New Line
            System.out.println();
        }
    }
}