/**
 * Q. Find the number of Zeroes in a Number.
 */

public class countZero {
    public static void main(String[] args) {
        int num = 102100210;
        System.out.println("Number of Zeroes: " + count0(num));
    }

    static int count0(int num){
        int count = helpCount(num, 0);
        return count;
    }

    // Helper Function
    static int helpCount(int num, int count){
        if (num==0) return count;
        
        if (num%10==0) count++;
        
        return helpCount(num/10, count);
    }
}
