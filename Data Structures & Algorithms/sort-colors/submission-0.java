class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int idx = 0;
        for(int i = min; i <= max; i++ ){
            while(map.get(i) > 0){
                nums[idx++] = i;
                
                map.put(i, map.get(i) - 1);

            }
        }
    }
}