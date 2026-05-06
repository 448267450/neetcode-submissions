class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int max = nums[0];
        if(n < k){
           for(int e : nums){
            if(e > max){
                max = e;
            }
           }
           return new int[max];
        }

        int l = 0, r = l + k;
        for(int i = 0; i < n-k+1; i++){
            for(int j = l; j < r; j++){
               if(nums[j] > max){
                max = nums[j];
               }
            }
            res[i] = max;
            l++;
            r = l + k;
            max = Integer.MIN_VALUE;
        }
        return res;
    }
}
