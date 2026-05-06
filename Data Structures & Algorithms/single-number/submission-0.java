class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(freq.keySet());

        for(int value : freq.keySet()){
            if(freq.get(value) == 1) return value;
        }

        return nums[0];
    }
}
