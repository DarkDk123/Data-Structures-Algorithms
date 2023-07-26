/**
 * Q. Find Factorial Using Recursion.
 */
public class recurFact {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The Factorial of " + n + " is : " + findFact(n));
    }

    // Factorial using recursion.
    static int findFact(int n){
        // Suppose 'n' given is +ve.
        if (n<=1) return 1;
        
        return (n * findFact(n - 1));
    }
}
