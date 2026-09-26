class Solution {
    public int maxProfit(int[] prices) {
        int minbuy = prices[0];
        int maxprofit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i]<minbuy){
                minbuy = prices[i];
            }else{
                int profit = prices[i]-minbuy;
                if(profit>maxprofit){
                    maxprofit = profit;
                }
            }
        }

        return maxprofit;
    }
}