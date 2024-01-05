/**
 * We're copying the previous lecture implementation of the Singly linked List to Accomplish this question.
 * 
 * We've to insert at the end of the Linked List Using Recursion.
 * Let's create a functions to do that.
 */

// Singly Linked List
// Default to Type Integer/int.
public class Q1_2_Custom_LL {
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
    public Node head; // For few changes due to questions.
    private Node tail;
    private int size; // size of the LL

    // Empty Constructor.
    // Initially head points to null.
    Q1_2_Custom_LL() {
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
        if (size == 1) {
            head = tail = null;
            return val;
        }

        // Turn last 2nd to tail node.
        tail = this.get(size - 2);
        tail.nextNode = null;

        size--;
        return val;

        // If we don't have LL.get() node method.
        // int val = tail.val;
        // if (tail == head)
        // head = tail = null;
        // else {
        // Node temp = head;
        // // Get last 2nd Node.
        // // Assign next to null | delete end
        // while(temp.nextNode.nextNode != null) temp = temp.nextNode;
        // tail = temp;
        // tail.nextNode = null;

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

        if (index == 0)
            return deleteStart();
        if (index == size - 1)
            return deleteEnd();

        Node preNode = this.get(index - 1); // Get one earlier node.
        int val = preNode.nextNode.val;

        preNode.nextNode = preNode.nextNode.nextNode;
        size--;
        return val;
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

        while (temp.nextNode != null) {
            sb.append(temp.val + ", ");
            temp = temp.nextNode;
        }
        sb.append(temp.val + " ]");

        return sb.toString() + " | Size: " + size;

    }


    // The below methods are just for solving questions.
    // They do not refer to methods specifically.
    // Just not making them "static", to prevent overhead.
    // They are just assumed to be non-related to the class or Object itself.


    // Method to insert at the end of the Linked List Using Recursion.
    // It needs the head & value only to insert at the end

    void insertEndRec(Node head, int value){
        // The LL is empty. | Insert here.
        if (head == null){
            Node tempNode = new Node(value);
            this.head = tempNode;

            tail = tempNode; // Specific to this Implementation.
            size++;
            return;
        }

        // If the next node is null, then the current Node is the Tail node.
        // We have to insert after it.
        if (head.nextNode == null){
            Node tempNode = new Node(value);
            head.nextNode = tempNode; // Assign at End.

            // Additional things specific to this implementation of the Linked List.
            size++;
            tail = tempNode;
            return; // End recursion.
        }

        // If "head.nextNode != Null" then, Call for next node.
        insertEndRec(head.nextNode, value);

        // Returns void
        return;
    }

    // Method to insert at given index. 
    // Index can be anything, from 0 till size (including)
    void insertAtIndexRec(Node head, int index, int val){
        // Not possible to insert.
        if (size < index || index < 0) {
            System.out.println("Cannot Insert at index " + index + " with size of LL : " + size);
            return;
        }

        // If insert at start. | Check only at first call.
        if(index==0){
            Node tempNode = new Node(val);
            tempNode.nextNode = head;
            this.head = tempNode;
            
            size++; // Specific to this implementation.
            tail = tempNode;
            return;
        }

        // Can't Insert | Invalid Index | Null LL
        if (head == null){
            return;
        }

        // If index == 1, we're one Node before the desired Index.
        // We'll insert from here at the next Node.
        if (index==1){
            Node tempNode = new Node(val);
            
            tempNode.nextNode = head.nextNode;
            head.nextNode = tempNode;
            
            // Specific to this implementation
            // If index is tail, change tail also.
            if (tempNode.nextNode == null){
                tail = tempNode; // tail.
            }

            size ++;
            return;
        }

        // If Not required index (index-1)
        // Next node with one less index.
        insertAtIndexRec(head.nextNode, index-1, val);
        return;
    }
}