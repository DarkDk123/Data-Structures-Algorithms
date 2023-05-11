/**
 * Q. Find Whether a given string is a 'Palindrome' or not.
 */
public class Q1_Palindrome {
    public static void main(String[] args){
        // Main.
        System.out.println(isPalindrome("nitin"));
    }

    // Palindrome check using Start & End Pointer.
    // It is case sensitive.
    static boolean isPalindrome(String strToCheck){
        // Empty string or null string.
        if (strToCheck.length()==0 || strToCheck == null) return true;

        int start = 0;
        int end = strToCheck.length()-1;
        while (start<end){
            if (strToCheck.charAt(start)!=strToCheck.charAt(end)) return false; // not equal | returning false.
            start++;
            end--;
        }
        // it's a palindrome, return true.
        return true;
    }

// Palindrome Solution by Kunal.
    static boolean isPalindrome2(String strToCheck){
        // Empty string or null string.
        if (strToCheck.length()==0 || strToCheck == null) return true;

        for(int i=0; i<=strToCheck.length()/2; i++){
            char start = strToCheck.charAt(i);
            char end = strToCheck.charAt(strToCheck.length()-1-i);
            
            if (start!=end) return false;
        }
        return true;
    }
}
