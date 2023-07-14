/**
 * Q. Find wether a number is Even or Odd by 'bit Manipulation'
 * 
 * We multiply binary bits from right side with "2^0, 2^1,..., 2^(n-1)".
 * Means all the bits are multiple of 2 | Even , Except last bit that determines
 * the number is even or odd.  
*/

public class bits_EvenOdd{
    public static void main(String[] args) {
        int n = 2;
    
        System.out.println("Is the Number Even? "+ isEven(n));
    }

    static boolean isEven(int n){
        // & Operator to get the last bit of the Number.
        // If It's 0, the number is Even else Odd.
        return (((n&1) == 0));
    }
}