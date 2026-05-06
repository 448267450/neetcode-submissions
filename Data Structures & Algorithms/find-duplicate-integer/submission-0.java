class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> times = new HashMap<>();

        for (int n : nums) {
            times.put(n, times.getOrDefault(n, 0) + 1);
            if(times.get(n)>1) return n;
        }
        return nums[0];
    }
}
