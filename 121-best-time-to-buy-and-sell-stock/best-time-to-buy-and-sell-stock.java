class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            buy=Math.min(prices[i],buy);
            int cost=prices[i]-buy;
            profit=Math.max(profit,cost);
        }
        return profit;
    }
}