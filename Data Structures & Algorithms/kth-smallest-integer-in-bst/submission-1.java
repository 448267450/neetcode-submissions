class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        
        offerQueue(pq, root, k);
        int idx = 0;
        int res = -1;
        while(!pq.isEmpty() && idx < k){

            res = pq.poll();
            idx++;
        }
    
        return res;
    }

    private void offerQueue (PriorityQueue<Integer> pq, TreeNode node, int k){

        if(node == null) return;

        pq.offer(node.val);
        
        
        offerQueue(pq, node.left, k);
        offerQueue(pq, node.right, k);

        
    }
}
