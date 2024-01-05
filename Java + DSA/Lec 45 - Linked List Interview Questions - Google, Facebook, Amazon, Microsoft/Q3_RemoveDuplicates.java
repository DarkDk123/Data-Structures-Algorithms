/**
 * Q3 A Leet-code question to remove duplicates from a sorted LinkedList.
 * 
 * Here's the Link : "https://leetcode.com/problems/remove-duplicates-from-sorted-list/"
 */

public class Q3_RemoveDuplicates {

    // Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
     
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
