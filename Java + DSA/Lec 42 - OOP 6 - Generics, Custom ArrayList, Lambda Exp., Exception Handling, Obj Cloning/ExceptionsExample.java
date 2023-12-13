/**
 * Exceptions & handling them through Code.
 */
public class ExceptionsExample {
    public static void main(String[] args) {
        // Following line can directly throw Exceptions, hence stopping the program.
        // System.out.println(divide2(5, 0));

        // We can handle potential Exceptions, to make our program Intractable.
        // By defining, what to do, if certain Exceptions occur.
        
        try { // Try Following code, if it throws exceptions?
            System.out.println(divide2(67, 88)); // This works
            System.out.println(divide2(67, 0)); // This throws Error.
        } catch (ArithmeticException e) { // Name the exception to catch.
            // Exception is the parent of all Exceptions, hence can catch everything.
            // We can be specific to specific Exceptions.
            System.out.println("Please sir, do not try to Divide by 0;");
        }
        // No matter what happens with the Exception.
        // Do the Following.
        finally{
            System.out.println("Program Completed.");
        }


        // Only one Catch block can be executed if there are many!
        try {
            throw new MyExp("I just want to throw Exception");
        } catch (MyExp e){
            System.out.println("It's my Exception!!");
        }

    }

    // A method that may throw an Exception.
    // A unchecked error.
    // If divided by 0, It'll throw an Exception.
    public static double divide(double a, double b){
        return a/b;
    }

    // We can throw, our desired exceptions at desired conditions.
    // "throws" to indicate, it may throw an Exception.
    public static double divide2(double a, double b) throws ArithmeticException{
        if (b==0) throw new ArithmeticException("Please don't divide by 0!!"); // It's an object.
        return a/b;
    }

}

// Creating custom Exceptions.
class MyExp extends Exception{

    MyExp(String msg){
        super(msg); // It will throw this msg as Exception.
    }
}