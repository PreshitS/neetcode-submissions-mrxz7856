class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int ans = 0;
        while(buy < sell && sell < prices.length){
            if(prices[sell] > prices[buy]){
                ans = Math.max(ans, prices[sell] - prices[buy]);
                sell++;
            }
            else if(prices[sell] < prices[buy]){
                buy = sell;
                sell++;
            }
            else{
                buy++;
                sell = buy + 1;
            }
        }
        return ans;
    }
}
