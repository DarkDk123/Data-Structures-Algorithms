/**
 * Example of Hierarchical inheritance | Tree Inheritance.
 * 
 *  Also, Single inheritance is already explained in "Inheritance.java".
 * 
 */

// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

// Child class 1 inheriting from Shape
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle...");
    }
}

// Child class 2 inheriting from Shape
class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a rectangle...");
    }
}

// Main class
public class Tree_Inheritance {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw();       // Accessing method from the parent class
        myCircle.drawCircle(); // Accessing method from the child class

        Rectangle myRectangle = new Rectangle();
        myRectangle.draw();          // Accessing method from the parent class
        myRectangle.drawRectangle(); // Accessing method from the child class
    }
}
