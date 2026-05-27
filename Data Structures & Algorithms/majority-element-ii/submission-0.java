class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        int l = nums.length / 3;

        for(int i = 0; i < nums.length; i++){

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(map.get(nums[i]) > l && !res.contains(nums[i])){
                res.add(nums[i]);
            }
        }

        return res;
    }
}