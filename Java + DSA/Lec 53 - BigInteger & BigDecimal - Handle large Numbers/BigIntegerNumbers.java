import java.math.BigInteger;

/**
 * Working with Big Numbers!
 */
public class BigIntegerNumbers {
    public static void main(String[] args) {


        // Working with very large Integer Numbers!

        BigInteger num = new BigInteger("666666666666666666666666666666666666666666666666"); // From String
        System.out.println(num + " of " + num.getClass());

        // Creating that large "long" would result in Error!

        // When working with comparatively smaller Integers we can use -

        BigInteger A = BigInteger.valueOf(4223);
        BigInteger B = BigInteger.valueOf(9274827);
        System.out.println(A);
        System.out.println(B);

        // It also have some constants
        System.out.println(BigInteger.ZERO); // ONE, TWO, TEN... etc. more

        // Addition
        System.out.println("Now Additions");
        System.out.println(num.add(A));
        // System.out.println(num + A);    // This isn't allowed!

        // Subtraction

        System.out.println("Now Subtractions");
        System.out.println(num.subtract(A));
        
        // Many More methods
        num.remainder(A);
        A.multiply(B); // etc.

        int c = A.intValue(); // Converting to int value
        System.out.println(c);
    }
}