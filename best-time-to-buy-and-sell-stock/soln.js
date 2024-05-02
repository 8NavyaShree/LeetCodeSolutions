/**
 * @param {number[]} prices
 * @return {number}
 LC 121
 */
var maxProfit = function(prices) {
    let n = prices.length;
        let min = Number.MAX_VALUE;

        let maxProfit = 0;
        for(let i = 0; i < n; i++){
            //update the min price
            if(prices[i] < min){
                 min = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - min) ;
        }
        return maxProfit;
};
