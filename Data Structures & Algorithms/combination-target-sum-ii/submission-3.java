class Solution {
    // Set<List<Integer>> seen = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, 0, res, subset);
        return res;
    }

    private void dfs(int[] candidates, int target, int sum, int index,
    List<List<Integer>> res, List<Integer> subset){
        


        if(sum == target){
            // if(!seen.contains(subset)){
                res.add(new ArrayList<>(subset));
                // seen.add(subset);
                return;
            // } 
            
            
        }

        if(sum > target) return;
        if(index == candidates.length) return;

        subset.add(candidates[index]);
        dfs(candidates, target, sum+candidates[index], index+1, res, subset);
        subset.remove(subset.size() - 1);

        while (index + 1 < candidates.length && candidates[index+1] == candidates[index]) {
            index++;
        }
        dfs(candidates, target, sum, index+1, res, subset);

        
    }
}
