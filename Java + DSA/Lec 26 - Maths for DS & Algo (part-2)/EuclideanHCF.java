/**
 * Q. Find the HCF of two Numbers by Euclidean method.
 * 
 *  It Uses a Property : HCF(a, b) = HCF(b, a%b) | Where a > b.
 */

class EuclideanHCF{
    public static void main(String[] args) {
        int a = 10, b = 15;

        System.out.printf("HCF of %d & %d is %d.\n", a, b, findHCF2(a, b));
    }

    // Iterative Solution.
    static int findHCF(int a, int b){
        // Ensure 'a' is greater than 'b'.

        if (a<b){
            // Swap to make 'a' greater than 'b'.
            int temp = a;
            a = b;
            b = temp;
        }

        // Applying Euclidean's Method Iteratively.
        while(b>0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
    
    // Recursive Solution
    static int findHCF2(int a, int b){
        // Suppose 'a' is greater than 'b'.
        if (b==0) return a;

        int remainder = a % b;
        return findHCF2(b, remainder);

    }
}