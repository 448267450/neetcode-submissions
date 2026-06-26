class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                list.add(nums[i]);
                len++;
            }
        }

        for(int j = 0; j < len; j++){
            nums[j] = list.get(j);
        }

        return len;
    }
}