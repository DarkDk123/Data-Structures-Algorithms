/**
 * In this example:
 * 
 * 1. The Shape class has a method called draw.
 * 
 * 2. The Circle and Square classes extend the Shape class and provide their own
 * implementation of the draw method.
 * 
 * 3. In the Main class, we create instances of Circle and Square and assign
 * them
 * to a variable of type Shape.
 * 
 * 4. The draw method is called on the myShape variable. At runtime, the correct
 * method (draw of Circle or Square) is determined based on the actual type of
 * the object. (not ref variable type!)
 * 
 * This demonstrates runtime polymorphism in a scenario where different shapes
 * have different implementations of a common method. The specific behavior is
 * determined during program execution based on the actual type of the object.
 */

// Base class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class 1
class Circle extends Shape {
    // Method overridden also occurs without "@override" annotation. 
    @Override // Only used to verify Method Overridden.
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Derived class 2
class Square extends Shape {
    // This overrides the same method in it's superclass.
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
    
}

// Main class
public class RuntimePoly {
    public static void main(String[] args) {
        Shape myShape;

        // Creating an instance of Circle
        myShape = new Circle();
        myShape.draw(); // Calls Circle's draw method

        // Creating an instance of Square
        myShape = new Square();
        myShape.draw(); // Calls Square's draw method



        // Also, if we print "square" object.
        // It internally calls the object's "toString()" method.
        // It's not defined in the Square class.
        // Hence, it calls the object's "toString()" method

        // This is determined at the "Runtime" level. (Runtime Polymorphism).
        System.out.println(myShape);
    }
}
