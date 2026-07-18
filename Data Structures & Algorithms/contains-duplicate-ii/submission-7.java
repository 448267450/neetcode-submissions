class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if(n == 1) return false;
        int left = 0; 
      
        while(left < n){
            for(int delta = 1; delta <= k; delta++){
                if(left + delta < n && nums[left] == nums[left + delta]){

                    return true;
                }
            }
            left++;
        }

        return false;
    }
}