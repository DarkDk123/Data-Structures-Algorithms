/**
 * Inheritance Example.
 * 
 *  Note: We can't inherit attributes/methods that are "private".
 */

public class Inheritance {
    public static void main(String[] args) {
        Human Adam = new Human(); // Human | Parent class object

        // Don't have intro method | It's in Child (Asian)
        // Attributes of Default Human.
        System.out.println("Human: skin - " + Adam.skinColor + ", hair - " + Adam.hairColor);

        // Create child object | Asian | default | no super constructor.
        Asian xinChu = new Asian(); // Child
        xinChu.intro(); // With inherited attr and additional methods.

        // Create child with given attributes | used super constructor.
        Asian customXinChu = new Asian("White", "Brown"); // Child
        customXinChu.intro();



    }
}


// Parent Class | Base Class
class Human{
    // Properties of a Human.

    // General Properties
    static int hand = 2;
    static int legs = 2;

    // Specific Properties
    String skinColor;
    String hairColor;

    // Default Constructor 
    Human(){
        // If no parameters are given, default constructor will be called.
        // Or if no "super constructor" is called in child class, default will be called.`
        
        this.skinColor = "black";
        this.hairColor = "black";
    }

    // Constructor
    Human(String sColor, String hColor){
        this.skinColor = sColor;
        this.hairColor = hColor;
    }
}

// Child Class | Derived Class
class Asian extends Human{
    float aveHeight = 5.8f;
    
    // default constructor, calls parent's default constructor.
    Asian(){
        System.out.println("Created an Asian with default properties!!");
    }

    Asian(String sColor, String hColor){
        // Super is for Constructor of Parent class.
        // Used to initialize values in Parent class.
        super(sColor, hColor);
        System.out.println("Created an Asian with given properties.");
    }

    // Get intro of the Asian.
    public void intro(){
        System.out.println("Hello from Asia, i'm a " + skinColor  + " with hair color as " + hairColor);
    }
}