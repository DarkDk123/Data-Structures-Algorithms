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

/**
 *
 *  ->  Analysed the Complexities of Sieve of Eratosthenes :
 * 
 *                  *Space Complexity = O(n).*
 *  
 *  As we take an extra Boolean array of size 'n' in the algorithm.
 *  It increases the Auxiliary Space to 'n', hence Total Space Complexity is "O(n)".
 * 
 *                      
 *                     *Time Complexity* 
 * 
 *  As by a Sample run, we found our algorithm's overall steps to be like :
 * 
 *      =>   n/2  + n/3 + n/5 + n/7 ... upto n/p 
 *      
 *          Where "p = sqrt(n) "
 *             
 *          because any larger prime's multiples would have been already marked off by smaller primes.
 *          
 *       These simplifies to: 
 *      =>  n(1/2 + 1/3 + 1/5 + 1/7 + 1/11 +...+ 1/p).
 *      
 *        It constitues a Harmonic Series:
 *          Hence this Harmonic Series of Prime Numbers denotes Complexity of "Log(Log(n))"
 * 
 *      The Final Time Complexity is : "nLog(Log(n))"
 * 
 */