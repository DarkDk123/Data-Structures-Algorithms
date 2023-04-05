public class EvenDigitCount {
    public static void main(String[] args) {
        // Main Functioning
        int[] array = {1, 32, 3, -5245, 0, 21};
        System.out.println("Total No. containing Even No. of Digits is: " + EvenDigitCounter(array));    
    }

    /**
     * A Method for Counting Numbers in Array containing Even number of Digits.
     * @param array An Array of Integers: int[]
     * @return Return a int type: int
     */
    static int EvenDigitCounter(int[] array){
        int EvenDigitNumbers = 0;
        for (int number : array) {
            
            if (number<0) number*=-1;
            else if (number==0) continue;
            
            int digit_count = 0;
            // optimized version of this loop is [Math.log10(number))+1;].
            while (number > 0){
                digit_count++;  
                /* Normal Division instead floor cause Java etc. return int only
                on a "int to int" Operation. */
                number /= 10;
            }
            if (digit_count%2==0) EvenDigitNumbers++;
        }
        return EvenDigitNumbers;
    }
}
