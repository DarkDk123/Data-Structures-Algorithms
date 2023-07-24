/** 
 * 
 * Q. Find Sqrt of a number without using any built in Pow function or Operator
 *    
 *      Used Divide & Conquer approach like binary search to tackle this.
 *      
 *      Also Implemented for finding non-perfect Square roots (floats)
 *      
 *      Time Complexity : O(log(n)).
 */

public class squareRoot {
    public static void main(String[] args) {
        int n = 11;
        System.out.printf("Square Root of %d is : %.3f\n", n, findSquareRoot(n));
    }

    // My Solution.
    static double findSquareRoot(int n){
        int start = 0; // Start
        int end = (n/2) + 1; // End ("(n/2) + 1" cause can't be less than sqrt(n))

        double sqRoot = 0;
        int p = 3; // precision values after decimal point.

        while (start<=end) {
            int mid = (start + end)/2;
            
            if ((mid*mid) == n) return mid;
            else if((mid*mid) > n) end = mid - 1;
            else start = mid + 1;
        }
        // On break condition, "start > end".
        // end becomes previous strat i.e. "Int value of Sqrt(n)"
        sqRoot = end;

        // For the precision Points
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while ((sqRoot*sqRoot)<n) {
                sqRoot += increment;
                if ((sqRoot*sqRoot)==n) return sqRoot;
            }
            sqRoot -= increment;
            increment /= 10;
        }

        return sqRoot;
    }
}
