# **Binary Trees Questions**

Questions on Trees are solved, all that are executed in the lecture!
Mostly questions are on **LeetCode**.


## Breadth First Search (Order level search)

This algo asks us to visit the nodes of a tree level by level.

First visit root node, then all nodes on next level, then continue next level...

#### When to use BFS?

- When answer probably lies near the root node.
- When operations should be performed level wise in the tree.


#### Implementation

Starting visit from the **root node**, we will store every child in an **queue**, then continuing until the queue becomes empty.

## 1. [Level order search](https://leetcode.com/problems/binary-tree-level-order-traversal/description/)

The question asks us to return a list of lists where each of the sublists contains the elements of each level of the tree, in the order of their level.

like this:  `[[3],[9,20],[15,7]]`

#### code :

```java
import java.util.LinkedList;
import java.util.Queue;


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> output = new ArrayList<>();

        if (root != null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            List<Integer> inner = new ArrayList<>();
            
            int size = queue.size();

            // Adding for current level!
            while (size > 0){
                TreeNode n = queue.remove();
                inner.add(n.val);

                if (n.left != null) {queue.add(n.left);}
                if (n.right != null) {queue.add(n.right);}
                size--;
            }
            
            output.add(inner);
        }
        

        return output;
    }
}
 
```


## 2. [Average of Levels in Binary Tree](https://leetcode.com/problems/average-of-levels-in-binary-tree/description/)

Almost same as previous.


```java
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
        List<Double> output = new ArrayList<>();

        if (root != null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            Double total = 0.0;
            int size = queue.size();

            // Adding for current level!
            for(int i = 0; i<size; i++){
                TreeNode n = queue.remove();
                total += n.val;

                if (n.left != null) {queue.add(n.left);}
                if (n.right != null) {queue.add(n.right);}
            }
            
            output.add(total/size); // One of them should be double!
        }
        

        return output; 
    }
}

```

## 3. Level order successor of a Node

Getting successor of a node in a level wise manner.

```java
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public TreeNode averageOfLevels(TreeNode root, int val) {
        Queue<TreeNode> queue = new LinkedList<>();
            
        if (root != null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            TreeNode n = queue.remove();

            if (n.left != null) {queue.add(n.left);}
            if (n.right != null) {queue.add(n.right);}
            
            // Check after adding!
            if (n.val == val){
                return queue.peek(); // doens't throw error if queue is empty!
            }
        }
        

        return null; 
    }
}

```


## 4. [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/)


We just need to change some logic. Using the reverse flag, we traverse specific levels in reverse order! Hence Zigzag Pattern at last.

```java
import java.util.LinkedList;
import java.util.Deque;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> output = new ArrayList<>();

        if (root != null){
            queue.add(root);
        }
        
        boolean reverse = false;

        while (!queue.isEmpty()){
            List<Integer> inner = new ArrayList<>();
            
            int size = queue.size();

            // Adding for current level!
            while (size > 0){
                if (reverse){
                    // Reverse logic!
                    TreeNode n = queue.pollLast();
                    inner.add(n.val);

                    if (n.right != null){
                        queue.offerFirst(n.right);
                    }

                    if (n.left != null){
                        queue.offerFirst(n.left);
                    }
                }

                else{
                    TreeNode n = queue.remove();
                    inner.add(n.val);

                    if (n.left != null) {
                        queue.add(n.left);
                    }

                    if (n.right != null) {
                        queue.add(n.right);
                    }
                }

                size--;
            }
            
            reverse = !reverse;
            output.add(inner);
        }
        
        return output;
    }
}

```


## 5. [Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/)

Here, we just need to traverse the tree levels in reversed form, from leafs to the root.\
So, we will modify existing code a little bit, adding inner lists [per level], at ***0*** index always!

```java
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> output = new ArrayList<>();

        if (root != null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            List<Integer> inner = new ArrayList<>();
            
            int size = queue.size();

            while (size > 0){
                TreeNode n = queue.remove();
                inner.add(n.val);

                if (n.left != null) {queue.add(n.left);}
                if (n.right != null) {queue.add(n.right);}
                size--;
            }
            
            output.add(0, inner); // Inserting at the start!
        }
        

        return output;
    }
}

```

## 6. [Populating Next Right Pointers in Each Node](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/)

Reading the description of the question, we can have few approaches to this question!

### A. Solution that works on **any Tree**, no matter it's perfect binary tree or not!

It is a slight modification of the previous **BFS code**.

```java

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();

        if (root != null){
            queue.offer(root);
        }

        while (!queue.isEmpty()){
            int size = queue.size();

            // For each level
            for (int i = 0; i<size; i++){
                
                // Assign next pointers
                Node n = queue.poll();

                // Assign next node by peek!
                // If it's not the last in this level!
                if (i != size-1){
                    n.next = queue.peek();
                }
                // Else Assign to null 
                else{
                    n.next = null;
                }
                
                if (n.left != null){
                    queue.offer(n.left);
                }
                
                if (n.right != null){
                    queue.offer(n.right);
                }
            }
        }

        return root;

    }
}

```

### B. Efficient and concise Solution that works especially for perfect binary tree.

This connects all children of current node, going level by level !

```java
// For Perfect BT, Iterative

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public Node connect(Node rootNode) {
        Queue<Node> queue = new LinkedList<>();

        if (rootNode != null){
            queue.offer(rootNode);
        }


        while (!queue.isEmpty()){
            Node root = queue.poll();

            if (root.right != null){
                root.left.next = root.right; // A Perfect BT.

                // Both exists
                queue.offer(root.left);
                queue.offer(root.right);
            }
            
            if (root.right != null && root.next != null){
                root.right.next = root.next.left;
            }

        }

        return rootNode;

    }
}
```

### C. Above solution with recursion (Concise code).

Because assigning ***next pointer*** doesn't require us to be level by level, we can use *Depth First Search* here with recursion stack.

```java
// For Perfect BT, Recursive, DFS

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public Node connect(Node root) {
        if (root == null){
            return root;
        }

        if (root.right != null){
            root.left.next = root.right;
        }

        if (root.right != null && root.next != null){
            root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);

        return root;
    }
}
```

## 7. [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/description/)

This is again just BFS solution, the only difference is that we are adding only the last node's value in each level.

There are also some DFS solutions (maybe more efficient) out there. We're doing the BFS one now.


```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null){
            queue.offer(root);
        }

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i<size; i++){
                TreeNode n = queue.poll();

                // If last node of current level.
                if (i == size-1){
                    ans.add(n.val);
                }

                // Insert it's children!
                if (n.left != null){
                    queue.offer(n.left);
                }

                if (n.right != null){
                    queue.offer(n.right);
                }
            }
        }

        return ans;
    }
}
```