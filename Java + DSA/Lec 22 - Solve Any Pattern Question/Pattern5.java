// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    
    /** Pattern 5: 
     *    " *
     *      **
     *      ***
     *      ****    
     *      *****
     *      ****
     *      ***
     *      **
     *      *   "
     * 
     */
     static void pattern5(int input){
         // We can see that here, "rows==(input*2)-1"
         for(int row=1; row<=((input*2)-1); row++){
             
             // Determining no. of columns.
             // columns = row untill row>input then (2*input-1)
            int totalColumns = (row<=input)?row:((2*input)-row);
            
            // Loop for Columns
            for(int col=1; col<= totalColumns; col++){
                System.out.print("* ");
            }
            // New Line.
            System.out.println();
         
     }
}
}