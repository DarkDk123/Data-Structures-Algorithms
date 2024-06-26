
/**
 * The most basic type of Binary Tree with no restrictions
 * And we'll try to implement functions to keep adding to this binary Tree
 */

import java.util.Scanner;

// Runner code
public class BinaryTree {
    public static void main(String[] args) {
        AbstractBinaryTree binaryTree = new AbstractBinaryTree();

        binaryTree.populate();
        binaryTree.display();
    }
}

/**
 * AbstractBinaryTree
 */
class AbstractBinaryTree {

    // Constructor
    AbstractBinaryTree() {

    }

    // Node Class
    public class Node {
        int val;
        Node leftChild, rightChild;

        Node(int n) {
            this.val = n;
        }
    }

    private Node root; // Root Node
    private Scanner SC = new Scanner(System.in); // Scanner for input

    // Inserting | for root node
    void populate() {
        System.out.print("Please insert the Integer value for the Root Node : ");
        int val = SC.nextInt();

        root = new Node(val);
        populate(root);

    }

    // Continuing Inserting for existing nodes
    void populate(Node _node) {
        System.out.println("Do you want to Enter the Left Node of y/n ?: " + _node.val);

        // If Left node!
        if (SC.nextBoolean()) {
            System.out.println("Enter the value of Left Node of " + _node.val);
            int val = SC.nextInt();

            _node.leftChild = new Node(val);
            populate(_node.leftChild);
        }

        System.out.println("Do you want to Enter the Right Node of y/n ?: " + _node.val);

        if (SC.nextBoolean()) {
            System.out.println("Enter the value of Right Node of " + _node.val);
            int val = SC.nextInt();

            _node.rightChild = new Node(val);
            populate(_node.rightChild);
        }
    }

    // Displaying the Tree
    public void display() {
        if (root == null) {
            System.out.println("No tree to show!!");
        } else {
            // display(root, "", true);
            display2(root, 0);
        }
    }

    // Helper for displaying
    private void display(Node root, String indent, boolean isTail) {
        if (root.rightChild != null) {
            display(root.rightChild, indent + (isTail ? "|   " : "    "), false);
        }
        System.out.println(indent + (isTail ? "`-- " : "+-- ") + root.val);
        if (root.leftChild != null) {
            display(root.leftChild, indent + (isTail ? "    " : "|   "), true);
        }
    }


    private void display2(Node root, int level){
        if (root==null){
            return;
        }

        display2(root.rightChild, level+1);

        if (level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }

            System.out.println("|----> " + root.val); 
        }
        else{
            System.out.println(root.val);
        }
        

        display2(root.leftChild, level+1);
    }
}

