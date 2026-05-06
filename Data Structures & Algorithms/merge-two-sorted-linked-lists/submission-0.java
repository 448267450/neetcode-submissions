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
    ListNode curr = null;
    ListNode preHead = new ListNode(-101);
    ListNode head = null;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 != null && list2 == null){
            curr = list1;
            if(preHead.val == -101) head = curr;
            preHead.next = curr;
            preHead = preHead.next;
        }
        if(list1 == null && list2 != null){
            curr = list2;
            if(preHead.val == -101) head = curr;
            preHead.next = curr;
            preHead = preHead.next;
        }

       if(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr = list1;
                if(preHead.val == -101) head = curr;
                preHead.next = curr;
                preHead = preHead.next;
                mergeTwoLists(list1.next, list2);
            } else {
                curr = list2;
                if(preHead.val == -101) head = curr;
                preHead.next = curr;
                preHead = preHead.next;
                mergeTwoLists(list1, list2.next);
            }
       }
     

        
        
        return head;
    }
}