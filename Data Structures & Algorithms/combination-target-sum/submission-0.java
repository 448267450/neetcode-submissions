class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, 0, 0, target, res, subset);
        return res;
    }

    private void dfs(int[] nums, int index, int sum, int target,
                     List<List<Integer>> res, List<Integer> subset) {

        // ✅ 1. 越界保护（最关键）
        if (index == nums.length) {
            return;
        }

        // ✅ 2. 找到合法解
        if (sum == target) {
            res.add(new ArrayList<>(subset));
            return;
        }

        // ✅ 3. 剪枝
        if (sum > target) {
            return;
        }

        // ===== 选择当前 nums[index] =====
        subset.add(nums[index]);
        dfs(nums, index, sum + nums[index], target, res, subset); // 可重复选
        subset.remove(subset.size() - 1);

        // ===== 不选当前 nums[index] =====
        dfs(nums, index + 1, sum, target, res, subset);
    }
}

