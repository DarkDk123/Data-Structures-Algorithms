/**
 * Example of Multi-Level Inheritance.
 */

// Grandparent class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Parent class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Child class inheriting from Dog
class GermanShepherd extends Dog {
    void guard() {
        System.out.println("Guarding...");
    }
}

// Main class
public class MultiLevel_inheritance {
    public static void main(String[] args) {
        GermanShepherd myDog = new GermanShepherd();
        myDog.eat(); // Accessing method from the grandparent class
        myDog.bark(); // Accessing method from the parent class
        myDog.guard(); // Accessing method from the child class
    }
}
