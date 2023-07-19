/**
 * Q. Calculate a^b by using bitwise operators.
 */

public class calculatePower {
    public static void main(String[] args) {
        int base = 2, power = 4;
        System.out.println("The power "  + power + " of " + base + " is " + powerBitwise(base, power));
        
    }

    static int powerBitwise(int base, int b){
        int ans = 1;

        while  (b>0){
            if ((b&1)==1){
                ans*=base;
            }
            
            base *= base;
            
            b >>= 1;
        }

        return ans;
    }
    
}
