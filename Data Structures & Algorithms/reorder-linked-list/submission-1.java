class Solution {
    public void reorderList(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        int n = 0;
        while(head != null){
           map.put(n, head);
           n++;
           head = head.next;
        }
        int start = 0;
        ListNode curr = map.get(0);
        int index = 0;
        // if(n == 1) curr.next = null;
        for(int i = n-1; i >= 0; i--){
            if(i == 0 && curr != null){
                curr.next = null;
                break;
            }
            if(index % 2 == 0){
                start += i;
                System.out.println("even start is:" + start);
            } else if (index % 2 != 0) {
                start -= i;
                System.out.println("prime start is:" + start);
            }
            

            if(curr != null){
                curr.next = map.get(start);
                curr = curr.next;
            }

            System.out.println("new start pointer is:" +start);
            System.out.println("curr value is:" + curr.val);
             index++;
        }
    }
}
