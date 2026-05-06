class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if(freq.get(num) > 1) freq.remove(num);
        }

        System.out.println(freq.keySet());

        int val = nums[0];

        for(int value : freq.keySet()){
            if(freq.get(value) == 1){
                val = value;
            }
        }

        return val;
    }
}
