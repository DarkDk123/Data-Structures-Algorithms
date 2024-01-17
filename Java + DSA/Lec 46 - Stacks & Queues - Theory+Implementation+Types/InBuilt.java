import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuilt {
    public static void main(String[] args) {
        // Inbuilt "Stack" Data Structure of Java.
        // Of Integer type.
        System.out.println("Let's learn Stack : ");
        Stack<Integer> myStack = new Stack<>();

        // Let's insert five items 
        System.out.println("Inserting 1-5 elements in Stack : ");
        for(int i = 1; i <= 5; i++){
            myStack.push(i);
        }

        System.out.println("Stack : " + myStack);

        // Removing : It follows Last In First Out order.
        for (int i = 1; i <=5; i++) {
            System.out.println("removal " + i + " : " + myStack.pop());
        }
        
        // Inbuilt "Queue" Data Structure of Java.
        // Of Integer type.
        // It's an Interface, we must use a linked list to actually use Queue here.

        System.out.println("\nLet's learn Queue : ");
        Queue<Integer> myQueue = new LinkedList<Integer>(); 

        // Let's insert five items 
        System.out.println("Inserting 1-5 elements in Queue : ");
        for(int i = 1; i <= 5; i++){
            myQueue.add(i);
        }

        System.out.println("Queue : " + myQueue);

        // Removing : It follows Last In First Out order.
        for (int i = 1; i <=5; i++) {
            System.out.println("removal " + i + " : " + myQueue.remove());
        }
        
        // In-built Dequeue Structure.
        // It's also an Interface, we need to use ArrayDeque implementing Deque Interface.
        Deque<Integer> myDeque = new ArrayDeque<>();
        
        // add in deque
        myDeque.add(5);
        myDeque.add(6);
        System.out.println("Deque : " + myDeque);

        // add at first
        myDeque.addFirst(5);
        System.out.println("Deque : " + myDeque);

        // remove from end/last.
        myDeque.removeLast();
        System.out.println("Deque : " + myDeque);
    }
}
