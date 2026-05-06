class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for(int s : stones){
            heap.offer(s);
        }

        int x = heap.poll();
        if(heap.size() == 0) return x;

        while(!heap.isEmpty()){
            if( heap.size() == 1) return x - heap.poll();
            heap.offer(x - heap.poll());
            x = heap.poll();
        }
        return x;
    }
}
