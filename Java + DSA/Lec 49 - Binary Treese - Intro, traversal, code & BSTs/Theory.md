# Trees

Trees are data structures that represent **hierarchical** relationships between entities, and trees are actually type of **graph data structures** with some conditions (Connected graphs that have no cycles).

More importantly Trees are hierarchical data structures that represent relationships between entities using edges.

* Most important/asked for interviews.
* Trees are just jokes *(according to kunal (instructor))*.

### **Prerequisites**

* Recursion
* OOP

### **Why use Trees?**

* Efficient if structured correctly (balanced)
* Well Structured data with relationships
* Cost efficient - dynamic in nature, can be automatically restructured (self-balancing)
* They may be inefficient with sorted data if not implemented properly


### **Real world Use cases**

There are many uses, few of them are -

File Systems, Databases, Algorithms/Networking, **Maths**, solving *math's equations*, and ***Decision Trees in ML***, File compressions, and other Tree based Data structures etc.


## In this tutorial, our Focus will be on *Binary Trees*

### **Terminologies**

- **Binary trees**: A tree data structure where each node has at most two children.

- **Size of tree**: The total number of nodes in a tree.

- **Siblings**: Nodes that share the same parent.

- **Edge**: A connection between two nodes in a tree.

- **Heights**: The number of edges on the longest path from a node to a leaf.

- **Leaf nodes**: Nodes with no children.

- **Height of a node**: The number of edges from the node to the deepest leaf.

- **Level/Depth of individual nodes**: The number of edges from the root to the node.

- **Level/Depth of trees**: The number of edges from the root to the deepest leaf.

- **Ancestor**: A node that is higher up in the tree and connected to a descendant.

- **Descendants**: Nodes that are lower in the tree and connected to an ancestor.



We'll focus on -

## Types of Binary Trees

![](https://miro.medium.com/v2/resize:fit:1400/0*cfgc3gvJ4cJiFB9G.png)



### **Common Properties of Trees**

**Perfect Binary Tree (BT)**

- **Total nodes**: $( 2^{h+1} - 1 )$
- **Leaf nodes**: $( 2^h )$
- **Total internal nodes**: $( 2^h - 1 )$

**Binary Tree with ( n ) Leaves**

- **At least levels**: $(\lceil log_2(n) \rceil )$

**Binary Tree with ( n ) Nodes**

- **At least levels**: $(\lceil log_2(n + 1) - 1 \rceil )$

**Strict Binary Tree**

- **Total leaf nodes** (when ( n ) is the total number of nodes and ( n ) is odd): $(\frac{n+1}{2} )$
- **Number of leaf nodes** (in a perfect strict binary tree): $(\frac{n}{2} + 1 )$


#### ***Refer to this GFG article for robust understanding of these terms [Here](https://www.geeksforgeeks.org/properties-of-binary-tree/)*.**




## Implementations

1. **Linked Representations -** generally using OOP and linking components
2. **Sequential Representations -**  using an array!

<br>

# Code Files

- **[BinaryTree.java](./BinaryTree.java)** - Implemented Binary Tree Using classes, it just keeps taking input for left and right child! and then displays the tree at the end.

- ***[BinarySearchTree.java](./BinarySearchTree.java)*** - A type of binary tree which have a sorted structure! like
  
  - Left child elements will always be smaller than the parent node.
  - And right child nodes will always be greater than the parent node.

    ### ***Balanced Trees :***
    - A balance tree is a efficient tree where, the absolute difference between the height left child node and the height of right child node will always be equal to or smaller than 1.
   
    - Like $\boxed{|(h_{left}  - h_{right})| <= 1}$
    - A balanced tree has complexity of ***$\log(n)$*** for all insertion, deletion and retrieval operations.
    - An unbalanced tree will be inefficient (skewed tree) with complexity of **O(N)** for all operations!

### ***Traversals -*** Traversing through the entire tree structure!

There are mainly two types of traversals in trees - 
  1. ***Breadth first traversal (BFS) -*** traverses as far as possible along each branch before backtracking. *(Queue)*
  2. ***Depth first traversal (DFS) -*** traverses level by level starting from the root. *(Stack)*
  

  Specific to binary trees, there are three kinds of DFS - 

  1. ***Pre-Order traversal -*** *Node-left-right* traversal.
  2. ***In-Order traversal -*** *Left-Node-right* traversal.
  3. ***Post-Order traversal -*** *Left-right-Node*
   
   