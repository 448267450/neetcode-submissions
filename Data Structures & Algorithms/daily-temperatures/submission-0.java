class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        
        for(int i = 0; i < n ; i++){
            for(int j = i; j < n; j++){
                if(temperatures[j] > temperatures[i]){
                    res[i] = j - i;
                    break;
                } 
                if(j == n -1 && temperatures[j] > temperatures[i]){
                    res[i] = 0;
                }
            }
        }
        return res;
    }
}
