/**
 * String Introduction.
 */
public class StrginIntro {

    public static void main(String[] args) {
        // A string is a "Collection of Characters"
        // String is a Object Data Type, uses String Class to be defined, & a component
        // of Java Class Library.
        // Convention of Classes are Capital Cases i.e. "String" etc.

        // Creating a string & Printing it.
        String fString = "It doesn't matter how you feel, you have to do it!!";
        System.out.println(fString);

        // About String Interning.
        // There are two Concepts:
        // (1) String Pool: Each new String Object is stored in a Seperate Memory, in
        // case it can be re-assigned
        // if similar value String is Created Again.
        // (2) Immutability: String Pool (Interning) doesn't arise conflicts if any one
        // reference changes string value.
        // Cause String object can't be altered/changed, it only creates a new String
        // Object. "It's for security reasons"

        // Created two Strings with same value.
        String s1 = "DataScience";
        String s2 = "DataScience";
        // Two methods for comparing String Objects.

        // (1) Built in Comparison (==) Operator: It checks either both Variables are
        // pointing to the same object (Interned) or not?
        System.out.println(s1 == s2); // true: means referencing to the same object.

        // Explicitely Creating new object (saying no to intern).
        String s3 = new String("DataScience");
        System.out.println(s1 == s3); // false: means s1 & s3 referencing to different objects.

        // (2) String obj's equals() method, for comparing just values.
        System.out.println(s1.equals(s3)); // Still s1 & s3 have same values, hence true.

        // Understood "System.out.println" Internal Working & how it uses
        // Method Overloading to work with different data types.
        // Everything given to Println/PrintStream is converted to a String.

        System.out.println(58);
        System.out.println("OverLoading ");
        // Learned how this above 2 methods are different for int, String & Other Data Types.
    }

}
