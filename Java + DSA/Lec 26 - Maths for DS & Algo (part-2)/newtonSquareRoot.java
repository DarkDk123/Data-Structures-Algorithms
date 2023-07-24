/** 
 * Q. Find the Square Root of a given Number
 *    by Newton Raphson method.
 */

public class newtonSquareRoot {
    public static void main(String[] args) {
        int x = 36;
        System.out.println(sqrtNRM(x));
    }

    static double sqrtNRM(double n){
        double x = n; // Guessing
        double root = 0; 
        while (true){
            root = 0.5 * (x + (n/x)); // Formula 

            if (Math.abs(root-x) < 0.5) break; // Where 0.5 is max error allowed.
            // We can also use "1e-6" instead. It equals almost 0.000001.
            
            // else again guessing the new root came from previous guess.
            x = root;
        }

            return root;
    }
}
