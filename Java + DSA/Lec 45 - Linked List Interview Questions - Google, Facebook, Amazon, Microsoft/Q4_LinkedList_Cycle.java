import java.util.ArrayList;

/**
 * LeetCode
 * Q3 Find weather a given Singly-linked list have cycle in it or not.
 * 
 * Here's the Link :
 * "https://leetcode.com/problems/linked-list-cycle/description/"
 */

public class Q4_LinkedList_Cycle {

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Solution 1 : With extra space O(n);
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> visited = new ArrayList<>();

        while (head != null) {
            if (visited.contains(head))
                return true;
            else
                visited.add(head);

            head = head.next;
        }

        return false;

    }

    // Solution 2 : Constant Space;
    // With Fast & Slow pointers.
    public boolean hasCycle2(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
                return true;
        }

        return false;

    }
}
