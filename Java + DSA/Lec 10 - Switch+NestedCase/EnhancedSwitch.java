import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
    // Program to Describe a fruit.
    
        System.out.println("Enter a Fruit Name: ");
        @SuppressWarnings("resource") // Also can supress "resource leak" warning with this.
        String fruit = new Scanner(System.in).next();
        
        // A Nicer format for switch case, known as "switch Expressions".

        switch (fruit.toLowerCase()){
            case "mango" -> System.out.println("King of Fruits.");
            case "orange" -> System.out.println("A round juicy Fruit.");
            case "apple" -> System.out.println("A sweet red Fruit.");
            case "bnana" -> System.out.println("A Fruit used for Pranks.");
            default -> System.out.println("Not a valid Fruit");
        }

    }

}
