/**
 * Example of Abstract Class & it's subclass.
 * 
 */
abstract class AbstractClass {

    // Constructor | Must be non-abstract
    // We can't create object of abstract classes i.e. AbstractClass.
    AbstractClass() {
        System.out.println("Constructing AbstractClass...");
    }

    // Abstract method | Must be overridden by subclass
    abstract public void createItMan();

    // Can have "static methods". | Must be non-abstract
    public static void staticMethods() {
        System.out.println("I'm a static method");
    }

    // Can have "normal methods".
    public void normal(){
        System.out.println("I'm not Abnormal...means Normal!!");
    }

}

// Sub-class inheriting AbstractClass.
class Subclass extends AbstractClass {

    // Constructor
    Subclass() {
        System.out.println("Sub-class created from Abstract Class.");
    }

    // Must override/implement required "abstract methods"
    @Override
    public void createItMan() {
        System.out.println("Created it man!!");
    }
    
}

// Runner Code
public class AbstractExample {
    public static void main(String[] args) {
        Subclass subObject = new Subclass();

        // Overridden method
        subObject.createItMan();

        // Inherited static method.
        AbstractClass.staticMethods(); // static reference

        // Inherited normal method
        subObject.normal();

    }

}