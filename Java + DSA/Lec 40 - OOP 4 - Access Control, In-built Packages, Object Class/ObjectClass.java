public class ObjectClass {
    public static void main(String[] args) {
        // Object of class A
        A obj = new A();

        System.out.println(obj);

        // Check if A is inherited from Object class or not!!
        System.out.println("A inherits Object class?? " + String.valueOf(obj instanceof Object));
    }
}


class A{

    @Override
    public String toString() {
        return "I'm an Object of Class A.";
    }
}
