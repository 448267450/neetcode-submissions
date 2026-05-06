class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;


        for(int i = 0; i<n-2; i++){
            int low = i+1, high = n-1;
            int sum = 0 - nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while(low < high){
                if (low > i+1 && nums[low] == nums[low - 1] ){
                    low++;
                    continue;
                }
                if (high < n-1 && nums[high] == nums[high + 1] ){
                    high--;
                    continue;
                }
                if(nums[low] + nums[high] < sum){
                    low++;
                } else if (nums[low] + nums[high] > sum){
                    high--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                }
            }
        }
        return result;
    }
}
