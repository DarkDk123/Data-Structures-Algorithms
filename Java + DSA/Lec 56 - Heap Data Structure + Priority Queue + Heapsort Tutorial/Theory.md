# Heaps, Priority Queues & Heap-sort

In this lecture we'll learn about Heaps, Priority Queues and Heap-sort with custom implementation of these data structures.


### Why Heaps?

- **Fast Min/Max Access**: Applications where we need quick access to the smallest or largest element (or other criteria), efficiency is required, heaps solve them.
  
- **Balanced Structure**: Unlike unbalanced binary trees, heaps maintain a ***complete tree structure***, ensuring efficient insertion and retrieval.
  
- **Memory Efficiency:** Heaps often use arrays for storage, which can be more memory-efficient and cache-friendly compared to linked structures, especially in applications requiring high performance.


### What i though at first !

Why understanding the problem, i just found another solution! Using ***Binary Search***, which can help us to find *min/max (or other criteria)* in **O(log n)** time.

But still, when removing the first or last element (as per the criteria), we required to shift all the elements after the removal that makes it ***O(nlogn)***, hence inefficient.

### What Are Heaps & How They Work?

- **Definition**: A *heap* is a complete binary tree that satisfies the *heap property*. In a **min-heap**, the root is the smallest; in a **max-heap**, it’s the largest.
  
- **Insertion & Deletion**: Insertion adds elements at the end, then adjusts the tree to maintain the heap property. Deleting the root swaps it with the last element, then “bubbles down” to restore order.
  
- **Efficiency**: Heaps offer (O(1)) access to the min/max element, and (O(log n)) for insertion/deletion due to their balanced structure.

Heaps are perfect for priority queues, sorting (heapsort), and managing tasks requiring quick access to the highest/lowest priority items.

## Code Implementation

Implemented MinHeap here : [MinHeap](./Heaps.java#L11).

---
#### I also understood some benefits of Heaps over BSTs for these type of problems.

|  Type  | BST (*) | Heap |
|--------|---------|------|
| Insert | average | O(1) | O(log n) |
| Insert | worst   | O(log n) | O(log n) or O(n) (***) |
| Find any | worst  | O(log n) | O(n) |
| Find max | worst  | O(1) (**)| O(1) |
| Create  | worst  | O(n log n)| O(n) |
| Delete  | worst  | O(log n) | O(log n) |

Ref: [StackOverflow Solution](https://stackoverflow.com/a/29548834).