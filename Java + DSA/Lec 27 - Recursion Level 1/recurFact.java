/**
 * Q. Find Factorial Using Recursion.
 *
 * Q. Find Sum of numbers from 'n' to 1 using recursion.
 */
public class recurFact {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The Factorial of " + n + " is : " + findFact(n));
        System.out.println("The Sum of nums from " + n + " to 1 is : " + findSum(n));
    }

    // Factorial using recursion.
    static int findFact(int n){
        // Suppose 'n' given is +ve.
        if (n<=1) return 1;
        
        return (n * findFact(n - 1));
    }

    // Same approach
    static int findSum(int n){
        if (n<=1) return 1;
        
        return  (n + findSum(n-1));
    }
}
