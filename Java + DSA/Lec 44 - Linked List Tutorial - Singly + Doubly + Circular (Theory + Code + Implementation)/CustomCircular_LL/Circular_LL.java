package CustomCircular_LL;

/**
 * Creating Custom Circular Linked List From learned OOP Concepts.
 * With the use of Classes and objects.
 */

// Circular Linked List
// Default to Type Integer/int.

public class Circular_LL {
    // Private Node class to create nodes.

    private class Node {
        int val; // value of the node
        Node nextNode; // Next node

        // Constructor
        Node(int val) {
            this.val = val;
        }

        // Additional constructor.
        Node(int val, Node nextNode) {
            this.val = val;
            this.nextNode = nextNode;
        }
    }

    // Head and Tail Nodes of the LL.
    // Private to avoid direct access.
    private Node head;
    private Node tail;
    private int size; // size of the LL

    // Empty Constructor.
    // Initially head points to null.
    Circular_LL() {
        size = 0; // size zero
    }

    // Insert at start
    void insertStart(int val) {
        Node tempNode = new Node(val, head); // Node to insert
        size++;

        // Empty LL
        if (head == null) {
            head = tail = tempNode;
            head.nextNode = head;
        } else {
            head = tempNode;
            tail.nextNode = head;
        }

    }

    // Insert at end method.
    void insertEnd(int val) {
        Node tempNode = new Node(val, head); // Node to insert
        size++;

        // If it's empty
        if (tail == null) {
            head = tail = tempNode;
            head.nextNode = head;
        } else {
            tail.nextNode = tempNode;
            tail = tempNode;
        }
    }

    // Insert at any possible index.
    void insertAtIndex(int val, int index) {
        // Not possible to insert.
        if (size < index || index < 0) {
            System.out.println("Cannot Insert at index " + index + " with size of LL : " + size);
            return;
        }

        // If index is 0;
        if (index == 0) {
            insertStart(val);
            return;
        }

        else if (index == size) {
            insertEnd(val); // Insert at end;
            return;
        }

        Node tempNode = new Node(val);
        Node temp = head;

        // We could use "this.get" method here to get "index-1" node.
        for (int i = 0; temp != null; i++) {
            // Desired index
            if (i + 1 == index) { // Stop at i, 1 less than index
                tempNode.nextNode = temp.nextNode;
                temp.nextNode = tempNode;
                size++;
            }

            // Move ahead.
            temp = temp.nextNode;
        }
    }

    // delete from start
    int deleteStart() {
        if (head == null) {
            System.out.println("Can't delete from Empty List.");
            return -1;
        }

        int val = head.val;
        if (tail == head)
            head = tail = null;
        else {
            head = head.nextNode;
            tail.nextNode = head;
        }
        size--;
        return val;
    }

    // delete from end
    int deleteEnd() {
        if (head == null) { // if head = null, then tail = null.
            System.out.println("Can't delete from Empty List.");
            return -1;
        }

        int val = tail.val;
        if (size == 1) {
            head = tail = null;
            return val;
        }

        // Turn last 2nd to tail node.
        tail = this.get(size - 2);
        tail.nextNode = head;

        size--;
        return val;
    }

    // Delete from end | if tail isn't available.
    // int deleteEnd() {

    //     if (head == null) { // if head = null, then tail = null.
    //         System.out.println("Can't delete from Empty List.");
    //         return -1;
    //     }

    //     // We don't have tail.
    //     Node temp = head;
    //     Node prev = head;
    //     while(temp.nextNode != head){
    //         prev = temp;
    //         temp = temp.nextNode;
    //     }

    //     int val = prev.nextNode.val;
    //     prev.nextNode = prev.nextNode.nextNode;
    //     tail = prev; // Still need to assign tail here.

    //     size--;
    //     return val;
    // }

    // Delete from index.
    int deleteFromIndex(int index) {
        // Not possible to delete.
        if (size <= index || index < 0) {
            System.out.println("Cannot delete from index " + index + " with size of LL : " + size);
            return -1;
        }

        if (index == 0) {
            return deleteStart();
        }

        if (index == size - 1) {
            return deleteEnd();
        }

        // Use private get method.
        // Get one previous node.
        Node prev = get(index - 1);
        int val = prev.nextNode.val;
        prev.nextNode = prev.nextNode.nextNode; // Removed

        size--;
        return val;
    }

    void deleteElement(int ele){ // Deletes first element encountered.
        if (head==null){
            System.out.println("Can't be deleted until existed...");
            return;
        }

        Node temp = head;
        Node prev = head;

        do {
            if (temp.val == ele){
                if (prev.nextNode == head){
                    head = prev.nextNode.nextNode;
                }
                if (prev.nextNode == tail){
                    tail = prev.nextNode.nextNode;
                }
                size--;
                prev.nextNode = prev.nextNode.nextNode;
                return;
            }

            prev = temp;
            temp = temp.nextNode;
        } while (temp!=head);
    }

    // Get element from index
    int getElement(int index) {
        return this.get(index).val;
    }

    // Get Node at given index.
    private Node get(int index) {
        // Not possible.
        if (size <= index || index < 0) {
            System.out.println("Cannot get %d-th element with %d sized List.".formatted(index, size));
            return null;
        }

        // Get i-th Node & return.
        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.nextNode;

        return temp;
    }

    // toString method
    @Override
    public String toString() {
        if (head == null) {
            return "NULL";
        }

        Node temp = head;
        StringBuilder sb = new StringBuilder("[ ");

        // If we do basic printing here, we would need to use a Do-while loop
        // to at-least run this once.
        while (temp.nextNode != head) {
            sb.append(temp.val + ", ");
            temp = temp.nextNode;
        }
        sb.append(temp.val + " ]");

        return sb.toString() + " | Size: " + size;

    }
}