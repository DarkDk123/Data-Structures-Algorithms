/**
 * Q12 Find whether a Linked List is Palindrome or not.
 * 
 */
public class Q12_PalindromeLL {
    // Solution: Using 2 of existing methods that we have implemented so far.
    public boolean isPalindrome(ListNode head) {
        ListNode middle = reverseListIter(getMidWithCut(head));

        while (middle != null && head != null) {

            if (middle.val != head.val)
                break;

            middle = middle.next;
            head = head.next;
        }

        return middle == null || head == null;
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