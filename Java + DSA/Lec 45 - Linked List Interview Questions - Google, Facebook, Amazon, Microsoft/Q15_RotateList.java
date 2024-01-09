/**
 * Q15 RotateList by k time.
 * 
 * LeetCode : "https://leetcode.com/problems/rotate-list/"
 */
public class Q15_RotateList {
    
    // Solution : First Skipping (length - k) nodes to make it end.
    // and to place next nodes to the start of the list.
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int length = getLen(head);

        k %= length;

        ListNode current = head;
        for (int i = 1; i < length - k; i++) {
            current = current.next;
        }

        ListNode temp = current.next;
        ListNode answer = temp;

        current.next = null; // Make tail.

        while (temp != null && temp.next != null) {
            temp = temp.next;
        }

        if (temp != null)
            temp.next = head;

        return (answer != null) ? answer : head;
    }

    
    // Get Length.
    private int getLen(ListNode head) {
        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }
    
}