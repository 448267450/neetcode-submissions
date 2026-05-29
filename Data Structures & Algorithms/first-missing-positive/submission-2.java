class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int target = 0;


        for(int num : nums){
            if(!set.contains(num)) set.add(num);
            if(num < min) min = num;
            if(num > max) max = num;
        }

        if(max < 1) return 1;

        for(int i = 1; i <= max; i++){
            if(!set.contains(i) && i > 0) return i;
        }

        return ++max;
        
    }
}