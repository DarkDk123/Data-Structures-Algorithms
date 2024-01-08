/**
 * Q5 Find the length of the cycle in the list.
 */
public class Q5_LL_CycleLen {
    
    // Solution.
    // With Fast & Slow pointers.
    public int cycleLen(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                // Calculate Cycle Length.
                int len = 1;
                // We can also use "do-while" loop here.
                while (slow.next != fast) {
                    len++;
                    slow = slow.next;
                }

                return len;
            }
        }

        return 0;

    }
}