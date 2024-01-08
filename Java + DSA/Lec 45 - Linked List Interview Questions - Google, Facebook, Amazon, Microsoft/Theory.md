# **Lecture 44 - Linked List Interview Questions**

We'll do **linked List questions** here, including all the concepts, approaches and tips for achieving that solution.

### Q.1 Insert at End of a Linked List Using Recursion.
I've copied the previous implementation of Linked List. And Inserted a method to insert at the end using Recursion.

It's in the file [Here](./Q1_2_Custom_LL.java#L233).

### Q.2 Insert at given index using recursion. 
My Solution [here](./Q1_2_Custom_LL.java#L265). I think, I messed it!!

Instructor's solution is so clean, you should visit that [Here](https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/325361dd2e9ab2d50bc7d2eeefada97d3d9db0d0/lectures/18-linkedlist/code/src/com/kunal/LL.java#L57)

### Q.3 Remove duplicates from a Sorted Linked List. ([LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)).

My solution [here](./Q3_RemoveDuplicates.java)

### Q.4 Detect cycle in a Singly Linked List. ([LeetCode](https://leetcode.com/problems/linked-list-cycle/))

Solution 1 (Mine) : [Here](./Q4_LinkedList_Cycle.java#L25)

Solution 2 (Slow, Fast Pointer) : [Here](./Q4_LinkedList_Cycle.java#L43)

**Fast and Slow Pointers:**

* **Fast Pointer:** Moves two nodes ahead at each step (fast = fast.next.next).
* **Slow Pointer:** Moves one node ahead at each step (slow = slow.next).
* **Key Idea:** If a cycle exists, the fast pointer will eventually catch up to the slow pointer, as they'll both be looping within the cycle.

### Q.5 Find the length of the Cycle in Linked List.

It's just same as before one, we have to find the cycle first **(with Fast & slow pointers)**, then again loop until we end up at the same Node. (This will find the length of the cycle).

Solution is [here](./Q5_LL_CycleLen.java).

### Q.6 Find the start of the cycle in linked list. ([LeetCode](https://leetcode.com/problems/linked-list-cycle-ii/))

Solution Code : [Here](./Q6_FindCycleStart.java)

### Q.7 Find whether the number is Happy or not. ([LeetCode](https://leetcode.com/problems/happy-number/))

First Solution : **Simulation**. [Here](./Q7_HappyNumber.java#L10)

Second Solution : **Fast, Slow Pointer**. [Here](./Q7_HappyNumber.java#L35)

### Q.8 Find the middle of the Linked List. ([LeetCode](https://leetcode.com/problems/middle-of-the-linked-list/))

**Approach 1 :** Find the length with 1 pass then traverse till middle. ***Code [Here](./Q8_MiddleOfLL.java#L7)***

**Approach 2 :** Find using Slow & Fast Pointer . ***Code [Here](./Q8_MiddleOfLL.java#L26)*** 

### Q.9 Sort a given linked List. 

**Approach 1 :** Sorting using bubble sort | Not Accepted *(TLE Error)* ***Code [Here](./Q9_SortLL.java#L7)***.

**Approach 2 :** Sorting using merge sort. ***Code [Here](./Q9_SortLL.java#L37)***

### Q.10 Reverse a LinkedList.

**Approach 1 :** Using Recursion just reverting the next pointers of Nodes. ***Code [Here](./Q10_ReverseLL.java#L8)***.

**Approach 2 :** Reverse using iteration ***Code [Here](./Q10_ReverseLL.java#L31)***
