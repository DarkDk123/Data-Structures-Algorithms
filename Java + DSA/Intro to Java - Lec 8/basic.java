import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        // Printing in Java.
        System.out.println("Printing Output to Command Line.");

        // Taking Input in Java by InputStream.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("Hey " + input.nextLine() + ", How Are you?");
        
        // Input Stream for Input must be closed to supress error "Resource Leak";
        input.close();


        // // Data Types -> Primitives
        
        // int roll = 25;
        // char love = 'U';
        // float life = 19.1f;
        // double attemps = 99212.1245412;
        // long LargeInt = 144579854542L;
        // boolean check = true;
    }
}
