class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int l = 0, r = 1;

        int minBuy = Integer.MAX_VALUE;
        // int maxSell = Integer.MIN_VALUE;
        int profit = Integer.MIN_VALUE;

        while(l < r && r < prices.length){
            minBuy = Math.min(minBuy, prices[l++]);
            // maxSell = Math.max(maxSell, prices[r++]);
            profit = Math.max(profit, prices[r++] - minBuy);
        }

    return profit < 0 ? 0 : profit;

    }
}
