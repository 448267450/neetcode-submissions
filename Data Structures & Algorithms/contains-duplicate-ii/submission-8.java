class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                window.remove(nums[i - k - 1]); // 滑出窗口的元素及时移除
            }
            if (!window.add(nums[i])) {
                return true; // add 返回 false 说明窗口内已存在该值
            }
        }
        return false;
    }
}