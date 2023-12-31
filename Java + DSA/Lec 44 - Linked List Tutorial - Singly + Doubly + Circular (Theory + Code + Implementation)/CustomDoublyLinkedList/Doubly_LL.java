package CustomDoublyLinkedList;

/**
 * Creating Custom Doubly Linked List From learned OOP Concepts.
 * With the use of Classes and objects.
 */

// Doubly Linked List
// Default to Type Generic Type.
public class Doubly_LL<T> {
    // Private Node class to create nodes.

    protected class Node {
        T val; // value of the node
        Node nextNode; // Next node
        Node previousNode; // Previous node

        // Constructor
        Node(T val) {
            this.val = val;
        }

        // Constructs with 3 parameters
        Node(T val, Node nextNode, Node previousNode){
            this.val = val;
            this.nextNode = nextNode;
            this.previousNode = previousNode;
        }
    }

    // Head and Tail Nodes of the LL.
    // Private to avoid direct access.
    private Node head;
    private Node tail;
    private int size; // size of the LL

    // Empty Constructor.
    // Initially head points to null.
    Doubly_LL() {
        size = 0; // size zero
    }

    // Insert at start
    void insertStart(T val) {
        Node tempNode = new Node(val, head, null); // Node to insert
        size++;

        // Empty LL
        if (head == null) {
            head = tail = tempNode;
        } else {
            head.previousNode = tempNode;
            head = tempNode;
        }

    }

    // Insert at end method.
    void insertEnd(T val) {
        Node tempNode = new Node(val, null, tail); // Node to insert
        size++;

        // If it's empty
        if (tail == null) {
            head = tail = tempNode;
        } else {
            tail.nextNode = tempNode;
            tail = tempNode;
        }
    }

    // Insert at any possible index.
    void insertAtIndex(T val, int index) {
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

        // Insert at index
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            // Desired index
            if (i == index) { // stop at i.
                Node tempNode = new Node(val, temp, temp.previousNode);

                temp.previousNode.nextNode = tempNode;
                temp.previousNode = tempNode;
                size++;
                return;
            }

            // Move ahead.
            temp = temp.nextNode;
        }
    }

    // delete from start
    @SuppressWarnings("unchecked")
    T deleteStart() {
        if (head == null) {
            System.out.println("Can't delete from Empty List.");
            return (T) new Object();
        }

        T val = head.val;
        if (tail == head)
            head = tail = null;
        else{
            head = head.nextNode;
            head.previousNode = null;
        }

        size--;
        return val;
    }

    // delete from end
    @SuppressWarnings("unchecked")
    T deleteEnd() {
        if (head == null) { // if head = null, then tail = null.
            System.out.println("Can't delete from Empty List.");
            return (T) new Object();
        }

        T val = tail.val;
        if (size == 1) {
            head = tail = null;
            return val;
        }

        // Turn last 2nd to tail node.
        tail = tail.previousNode;
        tail.nextNode = null;

        size--;
        return val;
    }

    // delete from index
    @SuppressWarnings("unchecked")
    T deleteFromIndex(int index) {
        // Not possible to delete.
        if (size <= index || index < 0) {
            System.out.println("Cannot delete from index " + index + " with size of LL : " + size);
            return (T) new Object();
        }

        if (index == 0)
            return deleteStart();
        if (index == size - 1)
            return deleteEnd();

        Node node = this.get(index); // Get index node.
        T val = node.val;

        node.previousNode.nextNode = node.nextNode;
        node.nextNode.previousNode = node.previousNode;

        size--;
        return val;
    }

    // Get element from index
    T getElement(int index) {
        return this.get(index).val;
    }

    // Get Node at given index.
    protected Node get(int index) {
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

    void displayRev(){
        if (head==null){
            System.out.println("NULL");
            return;
        }
        
        Node temp = tail;

        StringBuilder sb = new StringBuilder("Reversed LL : [");
        while(temp != null){
            if (temp.previousNode == null){
                System.out.println(sb.append(temp.val) + "]");
                return;
            }

            sb.append(temp.val + ", ");
            temp = temp.previousNode;
        }
        
        // No return.
    }
    // toString method
    @Override
    public String toString() {
        if (head == null) {
            return "NULL";
        }

        Node temp = head;
        StringBuilder sb = new StringBuilder("[ ");

        while (temp.nextNode != null) {
            sb.append(temp.val + ", ");
            temp = temp.nextNode;
        }
        sb.append(temp.val + " ]");

        return sb.toString() + " | Size: " + size;

    }
}