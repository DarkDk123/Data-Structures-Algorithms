/**
 * Q.8 Find "Middle Node" of the given Singly Linked List.
 */
public class Q8_MiddleOfLL {
    
    // Solution 1: Find length, traverse till middle.
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        
        // Get length.
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Get middle and return;
        temp = head;
        for (int i = 0; i < count / 2; i++)
            temp = temp.next;

        return temp;
    }

    // Solution 2: With Slow, Fast Pointer.
    public ListNode middleNode2(ListNode head) {
        if (head == null)
            return null;

        ListNode slow, fast;
        slow = fast = head;
        
        // If fast==null, then middle==slow;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    
    // Definition for singly-linked list.
    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}