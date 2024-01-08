/**
 * Q5 Finding the start of the Cycle in the Singly Linked List.
 * 
 * LeetCode - "https://leetcode.com/problems/linked-list-cycle-ii/"
 */
public class Q6_FindCycleStart {
    
    public ListNode detectCycle(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Cycle exists.
            if (fast == slow) {
                fast = head;
                // They'll be same distance away from start of the cycle.
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }

        return null;
    }
}
