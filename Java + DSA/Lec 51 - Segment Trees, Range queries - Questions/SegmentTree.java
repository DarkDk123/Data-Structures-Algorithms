/**
 * <h2>SegmentTrees</h2>
 * 
 * 
 * Runner class!
 * Segment Tree implementation for Range Queries!
 * 
 */
public class SegmentTree {
    public static void main(String[] args) {
        int[] arr = { 3, 9, 7, 6, -2, -8, 4, 9 };
        AbsSegmentTree tree = new AbsSegmentTree().fromArray(arr);
        tree.display();

        System.out.println("SUM :" + tree.getSum(0, 5));

        tree.updateValue(2, -30);
        System.out.println("\n\n");
        tree.display();

        // Systm.out.println("SUM :" + tree.getSum(3, 7));
    }
}

/**
 * <h2>AbsSegmentTree</h2>
 * 
 * Abstract Segment Tree Implementation!
 * 
 * <li>- Creating for Sum operation!</li>
 * <li>- Can be created from given array</li>
 */
class AbsSegmentTree {

    private class Node {
        private int val, start, end;
        private Node left, right;

        Node(int val, int start, int end) {
            this.val = val;
            this.start = start;
            this.end = end;
        }
    }

    private Node root; // Root node

    // Creating from integer array.
    public AbsSegmentTree fromArray(int[] array) {
        // If already created
        if (root != null) {
            return this;
        }

        root = build(array, 0, array.length - 1);
        return this;
    }

    // helper to build Segment Tree from array.
    private Node build(int[] array, int start, int end) {
        // Leaf Node
        if (start == end) {
            return new Node(array[start], start, end);
        }

        int mid = start + (end - start) / 2; // Divide in two parts

        // Build Left and Right tree
        Node left = build(array, start, mid);
        Node right = build(array, mid + 1, end);

        // Create parent node!
        Node parent = new Node(left.val + right.val, start, end); // With sum operation

        parent.left = left;
        parent.right = right;

        return parent;
    }

    // To update values in the tree

    public Node updateValue(int idx, int val) {
        if (root == null)
            return root;

        return updateValue(idx, val, root, root.start, root.end);
    }

    // Helper to update recursively!
    private Node updateValue(int idx, int val, Node node, int start, int end) {
        if (start == end && start <= idx && end >= idx) {
            // Arrived at Leaf Node to update!
            node.val = val;
            return node;
        }

        // Index not in this range!
        if (start > idx || idx > end) {
            return node;
        }

        // Get mid point!
        int mid = start + (end - start) / 2;

        // Update left and right accordingly!
        node.left = updateValue(idx, val, node.left, start, mid);
        node.right = updateValue(idx, val, node.right, mid + 1, end);

        node.val = node.left.val + node.right.val;

        return node;
    }

    // Get sum in given range.
    public int getSum(int start, int end) {
        // Not Applicable!
        if (root == null || start > end || root.start > start || end > root.end) {
            throw new Error("Cannot get sum between range! ensure you're doing something right!");
        }

        return getSum(root, start, end);
    }

    // Helper for sum
    private int getSum(Node node, int start, int end) {
        // 3 cases for node interval

        // Completely subset of query!
        if (node.start >= start && end >= node.end) {
            return node.val;
        }

        // Distinct set than query!
        else if ((node.start > end && node.start > start) || (node.end < start &&  node.end < end)) {
            return 0;
        }

        // Partially overlapped!
        int left = getSum(node.left, start, end);
        int right = getSum(node.right, start, end);

        return left + right;
    }

    // Display pretty
    void display() {
        displayPretty(root, 0);
    }

    private void displayPretty(Node root, int level) {
        if (root == null) {
            return;
        }

        displayPretty(root.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------>%d|[%d, %d]".formatted(root.val, root.start, root.end));
        }

        else {
            System.out.println("|%d|[%d, %d]".formatted(root.val, root.start, root.end));
        }

        displayPretty(root.left, level + 1);
    }
}