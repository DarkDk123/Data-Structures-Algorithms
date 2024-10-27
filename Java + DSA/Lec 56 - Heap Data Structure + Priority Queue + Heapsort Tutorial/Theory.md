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