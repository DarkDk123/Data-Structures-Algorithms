import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class UnderstandCollections {
    public static void main(String[] args) {
        // By Alt-Click, we can get the definition of this
        // Collection Interface, it's abstract methods etc.
        System.out.println(Collection.class);

        // This Collection is implemented by List Interface,
        // which further extends usable classes i.e. ArrayList, LinkedList, vector etc.

        
        // Methods are common in all elements of List Interface.
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        System.out.println(list);


        // Must implement abstract methods of List Interface
        List<Integer> LinkedList = new LinkedList<>();
        LinkedList.add(10);
        LinkedList.add(20);
        System.out.println(LinkedList);

        // It Also contains vectors that are synchronously accessible.
        // Unlike ArrayList, only single thread can access a vector.
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);

        System.out.println(vector);

        // Let's create and see Stack also.
        // It extends vector class & implements 5 methods of the Stack.
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(30);
        stack.push(50);
        stack.push(80);
        stack.push(920);
        stack.push(39);
        stack.pop();
        System.out.println(stack);
        

        
    }
    
}