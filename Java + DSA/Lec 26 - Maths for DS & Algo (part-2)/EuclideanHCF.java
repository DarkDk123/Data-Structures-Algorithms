/**
 * Q. Find the HCF of two Numbers by Euclidean method.
 * Q. Find the LCM of two Numbers.
 * 
 *  It Uses a Property : HCF(a, b) = HCF(b, a%b) | Where a > b.
 */

class EuclideanHCF{
    public static void main(String[] args) {
        int a = 12, b = 28;

        System.out.printf("1. HCF of %d & %d is %d.\n", a, b, findHCF2(a, b));
        System.out.printf("2. LCM of %d & %d is %d.\n", a, b, findLCM(a, b));
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
        // Recursion works either a>b or b>a.
        if (b==0) return a;

        int remainder = a % b;
        return findHCF2(b, remainder);
    }

    // Method to find LCM
    static int findLCM(int a, int b){
        int HCF = findHCF2(a, b);
        return ((a * b) / HCF);
    }
}