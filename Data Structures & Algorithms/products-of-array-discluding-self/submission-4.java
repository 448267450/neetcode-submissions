class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] m = new int[len];

        int[] dp_left = new int[len+1];
        dp_left[0] = 1;
        for(int i = 1; i <= len; i++){
            dp_left[i] = nums[i-1] * dp_left[i-1];
        }

        int[] dp_right = new int[len+1];
        dp_right[len] = 1;
        for(int j = len-1; j >= 0; j--){
            dp_right[j] = dp_right[j+1] * nums[j];
        }

        int[] res = new int[len];
        // res[0] = dp_right[1];
        // res[len - 1] = dp_left[len-1];

        for(int k = 0; k < len; k++){

            System.out.println("left part is: " + dp_left[k] + " and left idx is: " + k);
            System.out.println("right part is: " + dp_right[k+1]);
            res[k] = dp_left[k] * dp_right[k+1];
        }
        return res;
    }
}  
