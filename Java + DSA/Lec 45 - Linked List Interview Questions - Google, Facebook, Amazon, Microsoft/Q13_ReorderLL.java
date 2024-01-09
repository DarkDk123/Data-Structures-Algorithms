/**
 * Q. Reorder the given linked List as suggested.
 * 
 * LeetCode Question : https://leetcode.com/problems/reorder-list/
 */
public class Q13_ReorderLL {

    // I just did it by trying multiple times!!
    // Must be practiced much to be better.
    public void reorderList(ListNode head) {
        if (head.next == null)
            return;

        ListNode reversed = reverseListIter(getMidWithCut(head));
        ListNode tempHead = head;
        ListNode prevHead = null;

        while (reversed != null && tempHead != null) {
            prevHead = reversed;

            ListNode temp = tempHead.next;
            tempHead.next = reversed;
            tempHead = temp;

            temp = reversed.next;
            reversed.next = tempHead;
            reversed = temp;
        }

        if (reversed != null)
            prevHead.next = reversed;

        return;
    }

    // The Below methods are already implemented in previous lectures.
    // Reverse a list.
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

    // get middle by cutting into half.
    public ListNode getMidWithCut(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // With fast and slow pointers.
        ListNode fast, slow, slowPrev = null; // "slowPrev" is Null at start.
        slow = fast = head;

        // Find Length first.
        while (fast != null && fast.next != null) {
            slowPrev = slow; // Save Previous Slow.
            slow = slow.next;
            fast = fast.next.next;
        }

        slowPrev.next = null; // Break into two half.
        return slow; // Middle node.
    }
}
