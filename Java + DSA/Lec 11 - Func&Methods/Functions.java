import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        float first = input.nextFloat();
        System.out.println("Enter Second Number: ");
        float second = input.nextFloat();
        String ans = func_math(first, second);
        System.out.println(ans);

        // Closing the Scanner obj. (Best Practices)
        input.close();
    }

    static String func_math(float first, float second) {
        float sum = first + second;
        float product = first * second;
        float division = first / second;
        float sub = first - second;

        String ans = String.format("Sum: %f\nProduct: %f\nSubstraction: %f\nDivision: %f", sum, product, sub, division);
        return ans;
    };
}
