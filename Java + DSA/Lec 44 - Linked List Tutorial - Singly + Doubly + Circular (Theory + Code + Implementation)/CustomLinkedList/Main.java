package CustomLinkedList;
public class Main {
    public static void main(String[] args) {
        Custom_LL ll = new Custom_LL();

        // Insert at End
        for (int i = 1; i < 11; i++) {
            ll.insertEnd(i);
        }

        // Insert at end & start
        ll.insertEnd(38848);
        ll.insertStart(5);

        // Print Linked List
        System.out.println(ll);

        // Insert at index 7; then print.
        ll.insertAtIndex(27, 13);
        System.out.println(ll);

        // Delete from start & print.
        System.out.println("Deleted element : " + ll.deleteStart());
        System.out.println(ll);

        // Delete from last & print.
        System.out.println("Deleted element from end : " + ll.deleteEnd());
        System.out.println(ll);

        // Delete from index 8; then print.
        System.out.println("Deleted from index 8 : " + ll.deleteFromIndex(8));
        System.out.println(ll);

        // Get value at index 7;
        System.out.println("Get element from index 7 : " + ll.getElement(7));
    }
}
