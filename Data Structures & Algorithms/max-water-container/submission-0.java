class Solution {
    public int maxArea(int[] heights) {
        int maxAmount = 0;
        int left = 0, right = heights.length - 1;
        while(left < right){
            maxAmount = Math.max(maxAmount, 
            (right-left) * Math.min(heights[left], heights[right]));

            if(heights[left] <= heights[right]){
                left++;
            } else {
                right--;
            }
        }
       return maxAmount;
    }
}
