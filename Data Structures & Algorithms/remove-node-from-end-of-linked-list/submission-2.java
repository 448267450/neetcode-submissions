

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        Map<Integer, ListNode> map = new HashMap<>();
        map.put(-1, new ListNode(-1));
        ListNode curr = head;
        while(curr != null){
            map.put(len, curr);
            len++;
            curr = curr.next;
        }
        System.out.println(len);

        ListNode target = map.get(len - n);

        ListNode next = null;
        if(target.next != null){
            next = target.next;
        }
        if(target == head) head = next;
        ListNode prev = map.get(len - n-1);
        prev.next = next;

        return head;
    }
}
