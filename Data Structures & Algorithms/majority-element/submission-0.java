class Solution {
    public int majorityElement(int[] nums) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> (b[1] - a[1])
        );

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            set.add(num);
        }

        for(int s : set){
            maxHeap.add(new int[]{s, map.get(s)});
        }

        return maxHeap.poll()[0];

    }
}