/**
 * Q. Finding n-th Fibonacci term using recursion.
 *    
 *  Exa. Fib. series:  "0, 1, 1, 2, 3, 5, 8, 13 ...etc".
 *  
 *  Returning only the n-th term of the Series.
 */
public class RecurFibonacci {
    public static void main(String[] args) {
        int n = 7; // term starting from 0-th to n-th.
        System.out.printf("The %d-th Term is: %d\n", n, recurFib(n));        
    }

    // Recursive Func to Find n-th term of the Fibonacci Series.
    /**
     * Q. How to find whether problem can be solved by recursion or not??
     *  "Find it can be divided into smaller problems or not"
     *     Here: "Fib(n-th term) = Fib(n-1 term) + Fib(n-2 term)"
     * 
     *  Each of this smaller problem terms can also be divided into more smaller 
     *  chunks untill the problem becomes Fibonacci(1/0) i.e. 1/0 (Hence the base condition).
     *
     *  * If we break it down in a formula it's called recurrence relation
     *      i.e. "Fib(n-th term) = Fib(n-1 term) + Fib(n-2 term)"
     *   
     *  * It breaks somewhere (Base Condition) : Found by answers we already have.
     */
    
    static int recurFib(int n){
        
        if (n<0) return -1; // Wrong Input ( (-)ve Number ).
        
        // Two Base Condition.
        if (n<2) return n;

        // Some of Last two terms.
        return recurFib(n-1) + recurFib(n-2);
    }

    // Visualize the Whole Solution with Pen-Paper,
    
        // Here, Function will call two of it's own selfs.
        // Will wait for answer from the left function, only then 
        //      will call the 2nd self function.
}
