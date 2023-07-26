/**
* Q. Print All the Integers from given 'N' to '1' using recursion.
*
* Q. Print All the Integers from "1" to "N" using recursion.
*
*/

public class numberTillN{
    public static void main(String[] args) {
        int n = 7;
        System.out.print("Numbers from N to 1 are : ");
        till1(n);
        
        System.out.print("\nNumbers from 1 to N are : ");
        tillN(n);
       
        System.out.print("\nNumbers from N to 1 to N are : ");
        both1N(n);
       
        System.out.println();
    }

    // Prints integer from n to 1.
    static void till1(int n){
        if (n<1) return;
        System.out.print(n + " ");
        till1(n-1);
    }

    // From 1 to n.
    static void tillN(int n){
        if (n<1) return ;

        tillN(n-1);
        System.out.print(n + " ");
    }

    // From n to 1 then 1 to n | i.e. 3, 2, 1, 1, 2, 3
    static void both1N(int n){
        if (n<1) return ;

        System.out.print(n + " ");
        both1N(n-1);
        System.out.print(n + " ");
    }

    // Answer of my Curiosity.
    // From 1 to n then n to 1 | i.e. 1, 2, 3, 3, 2, 1
    static void both1NReverse(int i, int n){
        if (i>n) return ;
        
        System.out.print(i + " ");
        both1NReverse(i+1, n);
        System.out.print(i + " ");
        
    }

}