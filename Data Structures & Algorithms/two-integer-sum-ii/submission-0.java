class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 1, right = numbers.length;
        while(left < right){
            if(numbers[left-1] + numbers[right-1] == target){
                res[0] = left;
                res[1] = right;
                break;
            } else if(numbers[left-1] + numbers[right-1] > target) {
                right--;
            } else if(numbers[left-1] + numbers[right-1] < target){
                left++;
            }
        }

        return res;
    }
}
