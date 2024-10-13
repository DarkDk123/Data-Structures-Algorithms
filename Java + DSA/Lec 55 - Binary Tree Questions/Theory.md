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

## 8. [Cousins in Binary Tree.](https://leetcode.com/problems/cousins-in-binary-tree/description/)

Given `x` and `y`, two nodes in a tree having unique node values, we have to find they are cousins or not!

Two nodes are cousins if they are at the **same level** and have **different parents**.

### Solution 1: Iterative BFS

```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<List<TreeNode>> queue = new LinkedList<>();
        
        if (root != null) queue.offer(new ArrayList<>(Arrays.asList(root)));

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            
            // Get a score for each level, having node or not!
            int levelScore = 0;
            for (int i = 0; i<levelSize; i++){
                List<TreeNode> siblings = queue.poll();
                
                // For each siblings
                int siblingScore = 0;
                for (int j = 0; j<siblings.size(); j++){
                    TreeNode cur = siblings.get(j);

                    if (cur.val == x || cur.val == y){
                        siblingScore += 1;
                    }
                    
                    // Add children!
                    if (cur.left != null || cur.right != null){
                        List<TreeNode> children = new ArrayList<>();
                        
                        if (cur.left != null) children.add(cur.left);
                        if (cur.right != null) children.add(cur.right);

                        queue.offer(children);
                    }
                }

                // Check if siblings?
                if (siblingScore == 2){
                    return false;
                }

                // Add to level score
                levelScore += siblingScore;
            }

            // Check if cousins or not!
            if (levelScore == 2){
                return true;
            }
            
            // If one node on this level.
            else if (levelScore == 1){
                return false;
            }

            // No node, check next level!
        }

        return false;
    }
}

```

### Solution 2: Concise recursive BFS

Recursively find x and y nodes and storing their details, then checking if they are cousins or not !

```java
// Using DFS
class Solution {
    // Defining x and y details!
    // Required to check Cousin-ness!
    int xLevel, yLevel;
    TreeNode xParent, yParent;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, 0, null, x, y); // Get x & y info!
        
        return (xLevel == yLevel && xParent != yParent);
    }

    // Get x and y details
    // Finding using pre-order dfs.
    private void dfs(TreeNode root, int level, TreeNode parent, int x, int y){
        if (root == null){
            return;
        }

        // Found x!
        if (root.val == x){
            xLevel = level;
            xParent = parent;
        }

        // Found y!
        if (root.val == y){
            yLevel = level;
            yParent = parent;
        }

        dfs(root.left, level+1, root, x, y);
        dfs(root.right, level+1, root, x, y);
    }
}
```

## 9. [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/description/)

Find a tree is mirror of itself!

### Solution 1: Kunal's solution! *(instructor)*

```java
 class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        
        if (root != null){
            queue.offer(root.left);
            queue.offer(root.right);
        }

        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            // If odd no. of nodes!
            if (left==null && right == null){
                continue;
            }

            if (left==null || right == null){
                return false;
            }

            if (left.val != right.val){
                return false;
            }


            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }

        return true;
    }
 }
```


### Solution 2: Kunal's solution! *(instructor)*

DFS solution, using recursion!


```java
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root); // Start with root!
    }

    private boolean helper(TreeNode n1, TreeNode n2){
        if (n1 == null && n2 == null) return true;
        else if (n1==null || n2==null) return false;
        else if (n1.val != n2.val) return false;

        return helper(n1.left, n2.right) && helper(n1.right, n2.left);
    }
****
}
```

## Depth First Search (DFS)

In Depth First Search, we traverse the tree depth wise, starting from root to the leaf nodes.

We've already implemented DFS while creating [**Binary Trees**](../Lec%2049%20-%20Binary%20Trees%20-%20Intro,%20traversal,%20code%20&%20BSTs/Theory.md).

> **There are 3 variants of DFS**
#### Implementation

For each variant of DFS, we require a **"Stack"** to store the nodes in it, we just tweak it little to adapt pre, post or in-order DFS.

#### 1. Pre-order traversal

It goes in the order: **root -> left -> right.**

Visiting the root node, then complete left subtree, then right subtree!

##### When to use BFS?

- When we've to do something at particular level, and then go down!
- when left-right subtree operation is required after root node operations.


#### 2. In-order traversal

It goes in the order: **left -> root -> right.**

Visiting the Left subtree, then visit the node, then complete right subtree.

##### When to use BFS?

- Traversing a *BST* in sorted order.
- When building a copy of a tree.

#### 3. Post-order traversal

It goes in the order: **left -> right -> root.**

Visiting the Left subtree, then the right subtree, and at last the rot node!

##### When to use BFS?

- When printing out a tree in a "bottom-up" manner.
