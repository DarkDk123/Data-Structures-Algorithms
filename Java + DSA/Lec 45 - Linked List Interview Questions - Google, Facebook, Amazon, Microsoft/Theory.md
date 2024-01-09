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

**Approach 2 :** Sorting using merge sort. *****Code** [Here](./Q9_SortLL.java#L37)***

### Q.10 Reverse a LinkedList.

**Approach 1 :** Using Recursion just reverting the next pointers of Nodes. ***Code [Here](./Q10_ReverseLL.java#L8)***.

**Approach 2 :** Reverse using iteration ***Code [Here](./Q10_ReverseLL.java#L31)***

### Q.11 Reverse a LinkedList within a specific part only.

Just Implementing what's needed, applying previous reversing
approach at the particular part of the Linked list only. ***Code [here](./Q11_ReverseBetween.java#L9)***


### Q.12 Find whether a Linked List is palindrome or not.

**Approach:** As we want to take extra space.

We'll First get the middle of the Linked list. And will cut the List into two halves.

Then we'll reverse the second half of the list.

Now both halves should have equal values.

**Code [here](./Q12_PalindromeLL.java#L7).**

### Q.13 Reorder a given Linked List.

**Approach :** Again by using previous techniques for **getting middle** and  **reversing list** are used to solve this problem.

We'll reverse the other half of the list. And then reorder the list as suggested. ***Code [Here](./Q13_ReorderLL.java#L10).***

### Q.14 Reverse Nodes in k-groups.
We've to reverse the nodes of a given Linked List as k-node groups.

**Approach :**  We now know how to reverse within a [**specific range**](./Q11_ReverseBetween.java#L9),
we can easily reverse the LL into k-groups using these ranges. ***Code [here](./Q14_ReverseKGroup.java#L10)***