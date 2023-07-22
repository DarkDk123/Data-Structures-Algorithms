/**
 * Q.2 Given Int 'n', Find all the Prime Numbers that fall in the Range 2 to n. (including 2 & n)
 * 
 * Brutefrorce (Solu: 1) : We can apply the previous (General Prime Checker) in a loop for this range.
 * 
 * Solu: 2 -> Sieve of Eratosthenes -> An Algorithm to Efficiently Find all Prime numbers in a given range
 *          from 2 to n.
 * 
 *  Step-1  Here we'll take first Prime Number i.e. "2" then will remove all the multiples of 2 from
 *          the range ahead, Cause they are divisible by 2 & Not Prime Numbers.
 * 
 *  Step-2  We'll go onto next prime number i.e. "3", will do the same 
 * 
 *  Step -3 Repeating this Process till sqrt(n) cause after that numbers tend to repeat themselves
 *          as factors of previous numbers | Only the Prime Numbers will remain there.
 * 
 *  Ans - Hence the Numbers remaining (Not Discarded) are all the Prime Numbers of range 2 to n.
 */
public class FindPrimeInRange {
    public static void main(String[] args) {
        int n = 40;
        System.out.printf("Prime Numbers from %d to %d Are: ", 2, n);
        mySolution(n);
    }

    
    static void mySolution(int n) {
        // Extra cause leaving 0, 1 cells empty
        // and all other cells have value equals to index.
        boolean[] nums = new boolean[n+1]; 

        for (int ele = 2; ele*ele <= n; ele++) {
            // Discarding multiples.
            if (!nums[ele]){
                for (int j = ele*2; j <= n; j+=ele) {
                    nums[j] = true; // true to Non-Primes.
                }
            }
            
        }
        for (int i = 2; i < nums.length; i++) {
            if (!nums[i]) System.out.print(i + " ");
            
        }
        // We have Found All the non-Primes now print.
        
    }
}
