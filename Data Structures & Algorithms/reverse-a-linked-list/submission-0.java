/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    ListNode prev = null;
    public ListNode reverseList(ListNode head) {
        
        if(head == null) return head;
        ListNode newHead = head.next;
        ListNode curr = head;
        
        curr.next = prev;
        
        prev = curr;
        System.out.println(prev.val);
        
        reverseList(newHead);

        return prev;
    }
}
