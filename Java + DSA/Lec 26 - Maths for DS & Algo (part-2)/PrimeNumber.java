/**
 * Q. Find Whether a Number is Prime or not.
 * 
 *  (1) As general we know a loop solution with O(n) Complexity.
 *
 *  (2) By Observing the pattern we can know the numbers are repeating after sqrt(n), 
 *      so we are not checking again after sqrt(n).
 *  
 *      Hence the Complexity has decreased to O(sqrt(n)).
 */

class PrimeNumber{
    public static void main(String[] args) {
        int n = 7;
        System.out.printf("The Number %d is " + ((isPrime(n))?"Prime.\n": "Not Prime.\n"), n);
    }

    static boolean isPrime(int n){
        if (n<=1) return false; // 1, 0 and other (-)ve nums are non-prime.

        for (int i = 2; i*i <= n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

}