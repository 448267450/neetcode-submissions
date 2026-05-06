class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);

        int prev = 0;

        for(int n : nums){
            if(n == prev) return true;
            prev = n;
        }

        return false;
    }
}