/**
 * Q10 Reverse a Given Linked List.
 * LeetCode : "https://leetcode.com/problems/reverse-linked-list/"
 */

public class Q10_ReverseLL {

    // Solution 1: Using Recursion reversing a given Singly Linked List.
    // Using Recursion to change/revert "next" pointers of nodes.
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        return reverse(head, head, null);
    }
    
    // Helping method for recursion.
    private ListNode reverse(ListNode head, ListNode node, ListNode prev) {
        if (node.next == null) {
            head = node;
            node.next = prev;
            return head;
        }

        head = reverse(head, node.next, node);
        node.next = prev;

        return head;
    }
    

    // Solution 2: Using Iteration reversing a given LL!
    public ListNode reverseListIter(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode current, next, prev;
        prev = null;
        current = head;
        next = head.next;

        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null)
                next = next.next;
        }

        return prev;
    }
}