# AVL Trees Tutorial & Self Balancing BSTs


As we already learned ***Binary Search Trees!*** let's see what are the problems with ***BSTs -*** 

- If we insert elements only on one side of a Tree.
- Or we insert incremented elements in a Binary Search Tree sequentially.
- like : [5, 6, 7, 8, 9, 10], then it will be much inefficient!

Ideally, Trees should have ***$O(\log n)$*** time complexities for it's operations!

But this way, it becomes $O(n)$, inefficient!

So we've balanced Trees for this problem!

### Balanced Binary Tree

A **balanced Tree** is a tree such that ***every Node*** of the tree has a balance factor of ***1, -1 or 0***.

Let's see what a **balance factor** is!

**Balance Factor :** balance factor is the *difference of heights between the left and right nodes of a Parent Node*.


Or we can say, a **balanced tree** is a tree that has an "absolute height difference of ***$\le1$***" between the left and right nodes for every node in the tree!

|Balance and Unbalanced Tree|
|:-|
| ![balance factor](https://media.geeksforgeeks.org/wp-content/uploads/20221221160923/UntitledDiagramdrawio-660x371.png) |


hence, 

$$Balance Factor = height(left \ node ) - height({right \ node})$$

And for all nodes in a balanced tree, this must be True::

$$Balance \ Factor = -1, 1 \ or \ 0$$



## AVL Trees

**Adelson-Velsky and Landis tree** is a ***self balancing binary tree*** that automatically balances it's Nodes whenever they become unbalanced.

It solves above problem by automatically balancing itself on every insertion! By performing rotations to make tree balanced!

There are 4 main rotations -

- Left Rotation
- Right Rotation
- Left-Right Rotation
- Right-Left Rotation

Learn more on GFG [here](https://www.geeksforgeeks.org/introduction-to-avl-tree/).

We auto-balance the BST on each insertion (that can make it unbalanced), hence it is an AVL tree by using these algorithm!

The steps are generally like this:

1. Insert the Node ***N*** Normally!
   
2. Start upside from Node ***N***, find the node that makes the tree unbalanced.
   
3. This finding is done from bottom to top! (ensuring all bottom trees are already balanced).
   
4. Using one of above 4 rules, rotate the node (balances it).

5. Keep doing until the root node! (solving a subtree will solve the entire tree).