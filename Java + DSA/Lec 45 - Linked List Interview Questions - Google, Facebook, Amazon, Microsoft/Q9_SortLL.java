/**
 * Q.9 Sort the given Linked List.
 * LeetCode : "https://leetcode.com/problems/sort-list/"
 */
public class Q9_SortLL {
    
    // Solution 1: Sorting using bubble sort.
    public ListNode sortList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            ListNode temp2 = temp.next;

            while (temp2 != null) {
                if (temp2.val < temp.val) {
                    swapVal(temp, temp2);
                }

                temp2 = temp2.next;
            }

            temp = temp.next;
        }

        return head;
    }

    // Swap Node values only.
    private void swapVal(ListNode temp, ListNode temp2) {
        int val = temp.val;
        temp.val = temp2.val;
        temp2.val = val;

        return;
    }
    
    // Solution 2 : Sort using MergeSort Technique.
    public ListNode sortLL(ListNode head){
        
        // If length is 0 or 1. It's already sorted.
        if (head == null || head.next == null){
            return head;
        }

        // Else sort it using same method in recursion.
        else{
            ListNode mid = getMidWithCut(head);
            
            // Sort recursively.
            ListNode left = sortLL(head); // first half
            ListNode right = sortLL(mid);

            return merge(left, right); // return merge.
        }
    }

    // This method returns the mid of the LL.
    // Also makes a cut before mid.
    // Making it two different Lists.
    // It Divides the List at the middle Node.
    public ListNode getMidWithCut(ListNode head){
        if (head == null || head.next == null) return head;

        // With fast and slow pointers.
        ListNode fast, slow, slowPrev=null; // "slowPrev" is Null at start.
        slow = fast = head; 

        // Find Length first.
        while(fast != null && fast.next != null){
            slowPrev = slow; // Save Previous Slow.
            slow = slow.next;
            fast = fast.next.next;
        }

        slowPrev.next = null; // Break into two half.
        return slow; // Middle node.
    }


    // Merge two sorted Lists.
    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        
        ListNode temp, answer;
        temp = answer = new ListNode(0);

        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if (l1 != null){
            temp.next = l1;
        }
        else{
            temp.next = l2;
        }

        return answer.next;
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
