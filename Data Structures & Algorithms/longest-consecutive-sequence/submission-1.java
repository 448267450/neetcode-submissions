class Solution {
    public int longestConsecutive(int[] nums) {
        Stack<Integer> seq = new Stack<>();
        int maxLen = 0;
        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(seq.isEmpty() || (nums[j] == seq.peek() + 1)) seq.push(nums[j]);
            }
            maxLen = Math.max(maxLen, seq.size());
            seq.clear();
        }


        return maxLen;
    }
}
