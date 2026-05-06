class Solution {
    Set<List<Integer>> seen = new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, 0, res, subset);
        return res;
    }

    private void dfs(int[] candidates, int target, int sum, int index,
                     List<List<Integer>> res, List<Integer> subset) {

        if (sum == target) {
            // ✅ 修复点 1：存拷贝
            if (!seen.contains(subset)) {
                res.add(new ArrayList<>(subset));
                seen.add(new ArrayList<>(subset));
            }
            return;
        }

        if (sum > target || index == candidates.length) return;

        // ✅ 选当前数
        subset.add(candidates[index]);
        dfs(candidates, target, sum + candidates[index], index + 1, res, subset);
        subset.remove(subset.size() - 1);

        // ✅ 修复点 2：同层跳过重复
        int next = index + 1;
        while (next < candidates.length && candidates[next] == candidates[index]) {
            next++;
        }

        dfs(candidates, target, sum, next, res, subset);
    }
}

