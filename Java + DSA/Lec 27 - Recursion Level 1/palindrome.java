/**
 * Q. Find Palindrome of a Number.
 */

// Import the method to reverse a number from another file.

 public abstract class palindrome {
    public static void main(String[] args) {
        int n = 21212;
        System.out.println("Is " + n + " Palindrome? " + findPalindrome(n));
    }

    static boolean findPalindrome(int n){
        return (n==revNum.reverse(n)); // Used previous method.
        
    }
}
