class Solution {
    public int maxProfit(int[] prices) {
        int maxUntilNow = prices[prices.length - 1];
        int ans = 0;
        for(int i = prices.length - 1; i > -1; i--){
            maxUntilNow = Math.max(maxUntilNow, prices[i]);
            ans = Math.max(ans, maxUntilNow - prices[i]);
        }
        return ans;
    }
}
