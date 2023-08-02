/**
 * Q. Count Number of Steps taken to reduce a number to zero.
 *      
 *  In Every Step, if the current number is even, you have to divide it by 2,
 *  otherwise you have to subtract 1 from it.
 * 
 *  We have to do it using recursion.
 */

public class countSteps {
    public static void main(String[] args) {
        int n = 41;
        System.out.println("Steps taken: " + stepsTaken(n, 0));
    }


    // Based on required method structure
    // We can convert it to helper function.
    static int stepsTaken(int n, int steps){
        if (n==0) return steps;

        // We can make it one liner
        if (n%2==0) n/=2;
        else n-=1; // Using tertiary operator.
        
        return stepsTaken(n, ++steps);
    }

    
}
