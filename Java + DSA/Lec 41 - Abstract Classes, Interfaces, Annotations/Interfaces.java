/**
 * Example of Interfaces.
 * 
 * Interfaces allowing for multiple inheritance withou
 * 
 */
public class Interfaces {
    public static void main(String[] args) {
        // Object of class inheriting multiple interfaces
        AB obj = new AB();

        obj.methodA();
        obj.methodB();
    }
}

// First Interface
interface InterA {
    int a = 10;
    void methodA();
}

// Second Interface
interface InterB {
    int b = 90;
    void methodB();
}


// Class inheriting both interfaces | Multiple inheritance
class AB implements InterA, InterB {

    @Override
    public void methodB() {
        System.out.println("Method from interface A");
    }

    @Override
    public void methodA() {
        System.out.println("Method from interface B");
    }
    
}
