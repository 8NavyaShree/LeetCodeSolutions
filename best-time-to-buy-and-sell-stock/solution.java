class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;

        int maxProfit = 0;
        for(int i = 0; i < n; i++){
            //update the min price
            if(prices[i] < min){
                 min = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - min) ;
        }
        return maxProfit;
    }
}
