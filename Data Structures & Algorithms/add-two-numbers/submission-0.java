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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add1 = convertToNumber(l1);
        int add2 = convertToNumber(l2);
        int sum = add1 + add2;
        String s = String.valueOf(sum);
        Stack<ListNode> res_stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            res_stack.push(new ListNode(s.charAt(i) - '0'));
        }
        ListNode head = res_stack.pop();
        ListNode curr = head;
        while(!res_stack.isEmpty()){
            curr.next = res_stack.pop();
            curr = curr.next;
        }

        return head;
    }

    private int convertToNumber(ListNode l){
        Stack<ListNode> add_stack = new Stack<>();
        while(l != null){
            add_stack.push(l);
            l = l.next;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!add_stack.isEmpty()){
             sb.append(add_stack.pop().val);
        }
        return Integer.parseInt(sb.toString());
    }
}
