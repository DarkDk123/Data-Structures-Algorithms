public class Main {
    public static void main(String[] args) {
        Q1_Custom_LL ll = new Q1_Custom_LL();

        // Insert at End
        for (int i = 1; i < 11; i++) {
        ll.insertEndRec(ll.head, i);
        }
        System.out.println("Print after Loop added : " + ll);
        // Insert at end & start
        ll.insertEndRec(ll.head, 38848);
        ll.insertStart(5);

        // Print Linked List
        System.out.println(ll);

        // Insert at index 7; then print.
        ll.insertAtIndexRec(ll.head, 0, 27);
        ll.insertAtIndexRec(ll.head, 5, 3);
        ll.insertAtIndexRec(ll.head, 8, 12);
        ll.insertAtIndexRec(ll.head, 4, 98);
        System.out.println("After inserting few elements :" + ll);

        // Get value at index 7;
        System.out.println("Get element from index 7 : " + ll.getElement(7));
    }
}
