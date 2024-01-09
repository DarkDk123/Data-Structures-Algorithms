/**
 * Q11 Reverse a Linked List between the specified range only.
 *  LeetCode : 
 */
public class Q11_ReverseBetween {
    

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