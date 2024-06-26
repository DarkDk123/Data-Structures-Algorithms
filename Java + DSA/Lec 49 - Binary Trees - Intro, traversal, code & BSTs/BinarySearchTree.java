/**
 * BinarySearchTree
 */
public class BinarySearchTree {
    public static void main(String[] args) {
        AbstractBST BSTree = new AbstractBST();

        // BSTree.insertAll(new int[] { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10});

        // The problem is that it's not self-balancing!
        // Hence if the array is like sorted - {1,2,3,4,5,6,7,8,9,10}
        // The tree will be a skewed tree with complexity O(N) for each operation &
        // Memory!
        // Hence it's required to be self-balancing!

        // Efficient insertion with sorted data!
        BSTree.insertAllSorted(
                new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }, 0, 19);
        BSTree.display();
        
        System.out.print("\nPreOrder Traversal : ");
        BSTree.preOrder();

        System.out.print("\nInOrder Traversal : ");
        BSTree.inOrder();
        
        System.out.print("\nPostOrder Traversal : ");
        BSTree.postOrder();
        
    }
}

/**
 * AbstractBST
 */
class AbstractBST {

    AbstractBST() {

    }

    // Node of BST
    /**
     * Node
     */
    public class Node {
        private int val;
        private Node leftChild;
        private Node rightChild;
        private int height; // Height of the node for balance factor!

        Node(int val) {
            this.val = val;
        }

        int getValue() { // Getter for val
            return this.val;
        }
    }

    int getHeight(Node node) {
        return (node == null) ? -1 : node.height;
    }

    private Node root; // Root node

    // Is tree empty
    boolean isEmpty() {
        return (root == null) ? true : false;
    }

    // Tree height
    public int getHeight() {
        return getHeight(root);
    }

    // Insert
    public Node insert(int val) {
        root = insert(val, root);

        return root;
    }

    // Insert Helper
    public Node insert(int val, Node node) {
        if (node == null) {
            return new Node(val);
        }

        else if (node.val >= val) {
            node.leftChild = insert(val, node.leftChild);
        }

        else if (node.val < val) {
            node.rightChild = insert(val, node.rightChild);
        }

        node.height = Math.max(getHeight(node.leftChild), getHeight(node.rightChild)) + 1; // Increased height by 1

        return node;
    }

    // Check if tree is balanced!
    public boolean balanced(Node root) {
        if (root == null) {
            return true;
        }

        else if (Math.abs(getHeight(root.leftChild) - getHeight(root.rightChild)) > 1) {
            return false;
        }

        else {
            return balanced(root.leftChild) && balanced(root.rightChild);
        }
    }

    // Display Tree
    public void display() {
        display(root, "Root Node : ");

        System.out.println("\n\n");
        displayPretty(root, 0);
    }

    // display helper
    private void display(Node root, String details) {
        if (root == null) {
            return;
        }

        System.out.println(details + root.val);

        display(root.leftChild, "Left Node of %d :".formatted(root.val));
        display(root.rightChild, "Right Node of %d :".formatted(root.val));
    }

    void displayPretty(Node root, int level) {
        if (root == null) {
            return;
        }

        displayPretty(root.rightChild, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|-----> " + root.val);
        }

        else {
            System.out.println("|" + root.val);
        }

        displayPretty(root.leftChild, level + 1);
    }

    // Function to insert all array elements.
    public void insertAll(int[] nums) {
        for (int num : nums) {
            insert(num); // Insert element in the tree
        }
    }

    // Insert all elements of a sorted array in a efficient manner.
    public void insertAllSorted(int[] nums, int s, int end) {
        if (s > end)
            return;

        int mid = s - (s - end) / 2;

        insert(nums[mid]);
        insertAllSorted(nums, s, mid - 1);
        insertAllSorted(nums, mid + 1, end);
    }

    // All three DFS Traversals for a BST.
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print("--> " + root.val);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.leftChild);
        System.out.print("--> " + root.val);
        inOrder(root.rightChild);
    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print("--> " + root.val);
    }

    // To be called methods
    public void preOrder() {
        preOrder(root);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void postOrder() {
        postOrder(root);
    }
}
