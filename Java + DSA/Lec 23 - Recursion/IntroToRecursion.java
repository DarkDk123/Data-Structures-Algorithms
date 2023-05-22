/**
 * Recursion will be little hard at beginning,
 * But just do it consistently, it'll be much easy.
 * 
 * Pre-requisties to Recursion: (1) Functions | (2) Memory Management
 */
public class IntroToRecursion {
    public static void main(String[] args) {
        callFuncFromFunc(); // Function calling another function.
        recur_seq(1); // Recursive Function for Sequence from n to 10.

    }

    // Function calling another Function.

    /**
     * * "All the Function Calls lie in Stack Memory." *
     * (1) Main Function is called at start in every programming language. (also
     * last to terminate.)
     * (2) Function once completed is removed from the stack memory, the program
     * resumes from the line where the function was called.
     * 
     * "It's Showing Call Stack working: "
     *
     * (1) Function 1 Called{
     * (2) It calls Function 2{
     * (3) Calls Function 3{
     * "Does Something".
     * } Function 2 Waits for Function 3.
     * } Function 1 waits for Function 2 to complete.
     * }
     * 
     * "This is called Call Stack if a Function calls another one,
     * it then waits for that function to return something & then proceed the
     * original function."
     */
    static void callFuncFromFunc() {
        System.out.println("Called By: " + "callFuncFromFunc");
        System.out.println("calling Func temp :\n" + temp("I don't feel something!"));
    }

    // Function to be called by other Functions.
    // (Any Function can be called by another one if allowed)
    static String temp(String msg) {
        return "Something was on my Mind but you said: " + msg;
    }

    // ______________________RECURSION_____________________

    // When this multiple Function have similar body, find pattern &
    // call the same function in itself with a base condition.
    // A Function calling itself is known as Recursion.

    // Recursive Function for integer sequence till 10.
    static void recur_seq(int n) {
        System.out.println(n);
        if (n == 10)
            return; // Base Condition: Condition where Func. stops calling itself again & Ends.
        recur_seq(n + 1);
    }

    // Every Func. calling whether another func. or itself, it takes seperate memory space in stack.

    // If base Condition isn't there or malfunctioning, the function keeps calling itself &
    // every new function takes a separate memory space, it keeps goings until
    // computer goes out of memory (Stack Overflow).

    //______________Advantages_Of_RECURSION_________________

    // (1) It helps in solving bigger/complex problems in a more simpler way. | Breaking down
    //     bigger problems into smaller ones.
    // (2) Every Recursive Solution can turned into a Iterative (loops) one or vice-versa.
    // (3) Space complexity isn't constant, functions take much space in stack memory.


    // __________Recursion_Tree_________(Visualization of Recursion)

    // Every Function call to itself, all functions are connected 
    // to each other that can be visualized like a connected tree.
}
