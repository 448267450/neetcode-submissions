class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // 前缀和为 0 出现 1 次

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;
            // 如果 sum - k 存在，说明中间有子数组的和 = k
            count += prefixCount.getOrDefault(sum - k, 0);
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}