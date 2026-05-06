class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // 1️⃣ old node -> new node
        Map<Node, Node> map = new HashMap<>();

        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // 2️⃣ 连接 next 和 random
        curr = head;
        while (curr != null) {
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);     // 自动处理 null
            copy.random = map.get(curr.random); // 自动处理 null
            curr = curr.next;
        }

        return map.get(head);
    }
}

