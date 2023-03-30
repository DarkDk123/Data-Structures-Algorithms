import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean iloop = true;
        while (iloop) {
            System.out.println("Select Operation or 'x' for Exit.");
            System.out.print("Enter an Operation ('+', '-', '*', '/', '%'):  ");
            char op = input.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                iloop = false;
                System.out.println("Goodbye! 👋...");
                continue;
            }
            // I am using Swtich Now, Instructor will teach that in next Lecture.
            System.out.print("Enter First Number: ");
            float num1 = input.nextFloat();

            System.out.print("\nEnter Second Number: ");
            float num2 = input.nextFloat();
            double answer = 0;
            switch (op) {
                case '+':
                    answer = num1 + num2;
                    break;
                case '-':
                    answer = num1 - num2;
                    break;
                case '*':
                    answer = num1 * num2;
                    break;
                case '/':

                    if (num2 != 0) {
                        answer = num1 / num2;
                        break;
                    } else {
                        System.out.println("ZeroDivisionError: Can't Devide by Zero");
                        continue;
                    }
                case '%':
                    answer = num1 % num2;
                    break;

                default:
                    System.out.println("Invalid Operation!!");
                    break;
            }
        System.out.println(String.format("  --> Solution: %.2f %c %.2f = %.2f", num1, op, num2, answer));
        }

        // Closing to supress the "Resource leak" error by Scanner Obj.
        input.close();
    }
}
