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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val );
        if(lists.length == 0) return null;
        
        for(ListNode list : lists){
            while(list != null){
                pq.add(list);
                list = list.next;
            }
        }
       
       ListNode prev = new ListNode(-1001);
       ListNode head = pq.peek();
       ListNode curr = head;
       while(!pq.isEmpty()){
        curr = pq.poll();
        curr.next = pq.peek();

        curr = curr.next;
       }

        
        return head;
    }
}
