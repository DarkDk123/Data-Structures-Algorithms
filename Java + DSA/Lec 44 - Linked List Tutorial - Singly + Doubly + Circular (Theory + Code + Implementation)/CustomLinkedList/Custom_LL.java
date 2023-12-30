package CustomLinkedList;

/**
 * Creating Custom Singly Linked List From learned OOP Concepts.
 * With the use of Classes and objects.
 */

// Singly Linked List
// Default to Type Integer/int.
public class Custom_LL {
    // Private Node class to create nodes.

    private class Node {
        int val; // value of the node
        Node nextNode; // Next node

        // Constructor
        Node(int val) {
            this.val = val;
        }
    }

    // Head and Tail Nodes of the LL.
    // Private to avoid direct access.
    private Node head;
    private Node tail;
    private int size; // size of the LL

    // Empty Constructor.
    // Initially head points to null.
    Custom_LL() {
        size = 0; // size zero
    }

    // Insert at start
    void insertStart(int val) {
        Node tempNode = new Node(val); // Node to insert
        size++;

        // Empty LL
        if (head == null) {
            head = tail = tempNode;
        } else {
            tempNode.nextNode = head;
            head = tempNode;
        }

    }

    // Insert at end method.
    void insertEnd(int val) {
        Node tempNode = new Node(val); // Node to insert
        size++;

        // If it's empty
        if (tail == null) {
            head = tail = tempNode;
        } else {
            tail.nextNode = tempNode;
            tail = tempNode;
        }

        // // Loop till End | If not "tail" is available.
        // Node temp = head;
        // while (temp.nextNode != null) {
        // temp = temp.nextNode;
        // }

        // temp.nextNode = tail = tempNode;
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
        else
            head = head.nextNode;

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
        if (size == 1){
            head = tail = null;
            return val;
        }
        
        // Turn last 2nd to tail node.
        tail = this.get(size-2);
        tail.nextNode = null;

        size--;
        return val;

        // If we don't have LL.get() node method.
        // int val = tail.val;
        // if (tail == head)
        //     head = tail = null;
        // else {
        //     Node temp = head;
        //     // Get last 2nd Node.
        //     // Assign next to null | delete end
        //     while(temp.nextNode.nextNode != null) temp = temp.nextNode;
        //     tail = temp;
        //     tail.nextNode = null;

        // }
        
        // size--;
        // return val;
    }

    // delete from index
    int deleteFromIndex(int index) {
        // Not possible to delete.
        if (size <= index || index < 0) {
            System.out.println("Cannot delete from index " + index + " with size of LL : " + size);
            return -1;
        }

        if (index == 0) return deleteStart();
        if (index == size-1) return deleteEnd();

        Node preNode = this.get(index-1); // Get one earlier node.
        int val = preNode.nextNode.val;

        preNode.nextNode = preNode.nextNode.nextNode;
        size--;
        return val;
    }
    
    // Get element from index
    int getElement(int index){
        return this.get(index).val;
    }

    // Get Node at given index.
    private Node get(int index){
        // Not possible.
        if (size <= index || index < 0) {
            System.out.println("Cannot get %d-th element with %d sized List.".formatted(index, size));
            return null;
        }
        
        // Get i-th Node & return.
        Node temp = head;
        for(int i = 0; i < index; i++) temp = temp.nextNode;

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

        while (temp.nextNode != null) {
            sb.append(temp.val + ", ");
            temp = temp.nextNode;
        }
        sb.append(temp.val + " ]");

        return sb.toString() + " | Size: " + size;

    }
}