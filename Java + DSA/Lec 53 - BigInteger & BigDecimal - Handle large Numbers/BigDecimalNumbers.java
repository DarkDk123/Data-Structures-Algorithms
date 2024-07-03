import java.math.BigDecimal;

/**
 * Working with Big Decimal Numbers!
 */
public class BigDecimalNumbers {
    public static void main(String[] args) {

        // Precision Error with float & doubles
        System.out.println(0.03 - 0.02);

        BigDecimal A = BigDecimal.valueOf(0.03);
        BigDecimal B = BigDecimal.valueOf(0.02);

        System.out.println(A.subtract(B)); // It's accurate

        // Other operations
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
        System.out.println(A.divide(B));

        // Read about many more methods here -
        // https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F/java/math/BigDecimal.html
    }
}
