/**
 * Q. Given int a, Find XOR Operation of Numbers from 0 to a.
 * 
 *  By doing this manually for few number at beginning. We find a pattern.
 * 
 *  if (a % 4 == 0) then Ans = a
 *  else if (a % 4 == 1) then Ans = 1
 *  else if (a % 4 == 2) then Ans = a + 1
 *  else if (a % 4 == 3) then Ans = 0
 */

public class FindN_XOR {
    public static void main(String[] args) {
        int n = 17;

        System.out.printf("The XOR from 0 to %d is : %d\n", n, doXOR(n));
    }

    static int doXOR(int n){
        switch (n%4) {
            case 0:
                return n;

            case 1:
                return 1;

            case 2:
                return n+1;

            case 3:
                return 0;
        
        }
        return -1;
    }
}
