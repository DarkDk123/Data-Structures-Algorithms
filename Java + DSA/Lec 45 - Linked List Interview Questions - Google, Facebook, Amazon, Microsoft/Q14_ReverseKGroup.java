/**
 * Q. Reverse the given linked list in k-groups.
 * 
 * LeetCode Hard :
 * "https://leetcode.com/problems/reverse-nodes-in-k-group"
 */
public class Q14_ReverseKGroup {

    // Solution : Using the Q11 Answer with different custom ranges.
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1)
            return head;

        int n = getLen(head);
        int s = 1;

        for (int i = k; i <= n; i += k) {
            head = reverseBetween(head, s, i);
            s = i + 1;
        }

        return head;
    }

    // This are helping methods.

    // get length of the LL
    public int getLen(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }

    // Solution : Reversing specified part only.
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null)
            return head;
        if (left == right)
            return head;
        ListNode prev, current, next;
        ListNode head2, end; // For linking middle part.

        // Variables for reversing
        prev = null;
        current = head;
        next = head.next;

        // For linking reversed part.
        head2 = end = null;

        // Go to part to be reversed.
        for (int i = 1; i <= left && current != null; i++) {
            head2 = prev;

            prev = current;
            current = next;
            if (next != null)
                next = next.next;
        }

        end = prev; // End of reversed part.

        // Now, reverse the part.
        for (int i = 0; i < (right - left) && current != null; i++) {
            current.next = prev;

            prev = current;
            current = next;

            if (next != null)
                next = next.next;
        }

        // Remaining Linkage
        if (head2 != null)
            head2.next = prev;
        else
            head = prev;

        if (end != null)
            end.next = current;

        return head; // Return
    }
}
