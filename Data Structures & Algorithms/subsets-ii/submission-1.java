class Solution {
    List<List<Integer>> res;
    Set<List<Integer>> seen = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        res = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>());
        return res;
    }

    private void dfs(int[] nums, int idx, List<Integer> subset){
        if(idx == nums.length){
            if(!seen.contains(subset)){
               res.add(new ArrayList<>(subset));
               seen.add(subset);
            }
            
            return;
        }

        if(idx > nums.length) return;

        subset.add(nums[idx]);
        dfs(nums, idx + 1, subset);
        subset.remove(subset.size() - 1);
         
        if(idx + 1 < nums.length && nums[idx + 1] == nums[idx]) idx++;
        dfs(nums, idx + 1, subset);
    }
}
