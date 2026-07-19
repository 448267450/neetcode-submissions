class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i; j < prices.length; j++){
                if(prices[j] <= prices[i]){
                    continue;
                } else {
                    max_profit = Math.max(max_profit, prices[j] - prices[i]);
                }
            }
        }
        return max_profit;
    }
}
