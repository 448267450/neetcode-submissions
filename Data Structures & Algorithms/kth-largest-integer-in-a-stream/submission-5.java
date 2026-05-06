class KthLargest {
    int k = 0;
    PriorityQueue<Integer> pq; 
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
            if(pq.size() > k) pq.poll();
            System.out.println("before value: " + pq.peek());
        }
        
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k) pq.poll();
        System.out.println("after value: " + pq.peek());
        return pq.peek();
    }
}
