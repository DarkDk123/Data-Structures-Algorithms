import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {

        // Below line must have Type of a functional interface.
        // They aren't like Lambda Expressions of "Python"
        // int method = (int a, int b) -> (a+b); // Error.

        // We must create objects of Functional Interfaces.
        // while using lambda expressions

        ArrayList<Integer> list = new ArrayList<>(){{
            add(1);
            add(7);
            add(82);
        }};
        
        // It takes a "Consumer" Object | A functional Interface.
        // By giving it a "Lambda expression", we create an instance of "Consumer" Interface
        
        // It prints "num*7.7" for each item of the list.
        list.forEach((item) -> System.out.println(item * 7.7)); // Overriding single method of Functional Interface.


        // Now, let's implement only-method of a functional interface.

        // This way, we can declare 
        FuncInterface<Integer> sum = (a, b) -> a +b;
        FuncInterface<Integer> prod = (a, b) -> a * b;

        // It automatically creates an Class implementing this interface.
        // We don't need to create classes implementing this interface.
        
        System.out.println(sum.getClass());

        // Calling Operations defined by lambda expressions.
        // Functional interface instances.

        System.out.println("Sum : " + sum.operation(10, 20));

        System.out.println("Product : " + prod.operation(10, 20));

    }
}


// Functional interface
// Also Interface with Generic Type.
// To Operate on 2 items.
interface FuncInterface <T>{
    // Only method "Operation", takes 2 objects.
    T operation(T a, T b);
}
