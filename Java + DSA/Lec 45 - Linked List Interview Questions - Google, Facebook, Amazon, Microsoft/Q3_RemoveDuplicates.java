/**
 * Q3 A Leet-code question to remove duplicates from a sorted LinkedList.
 * 
 * Here's the Link : "https://leetcode.com/problems/remove-duplicates-from-sorted-list/"
 */

public class Q3_RemoveDuplicates {
    
    // Deleting duplicate Nodes from a Sorted Linked List.
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }

        return head;
    }
}
