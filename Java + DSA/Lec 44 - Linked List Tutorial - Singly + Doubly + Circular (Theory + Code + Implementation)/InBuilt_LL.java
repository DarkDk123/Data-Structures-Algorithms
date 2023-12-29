import java.util.LinkedList;

/**
 * We're already provided with a built-in Linked-List in java.
 * Let's use it for sake of knowing!!
 */

public class InBuilt_LL {
    public static void main(String[] args) {
        // LinkedList ll = new LinkedList<>(); // We can work with Generics also.

        // Having an Integer Linked List.
        LinkedList<Integer> ll = new LinkedList<>();

        // add elements
        for(int i = 1; i < 20; i+=2){
            ll.add(i);
        }

        // Print Linked List
        System.out.println(ll);

        ll.remove(Integer.valueOf(17)); // Remove object
        System.out.println("After removal : " + ll);
    }
    
}