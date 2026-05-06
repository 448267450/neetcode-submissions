class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = 1;
        while(left <= right && right < nums.length){
            if(nums[left] == nums[right] && right - left >= 1){
                return nums[left];
            } else{
               left++;
               right++;
            }
        }
        return nums[0];
    }
}
