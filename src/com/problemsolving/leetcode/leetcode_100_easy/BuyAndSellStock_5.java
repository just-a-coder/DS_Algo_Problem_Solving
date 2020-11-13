package com.problemsolving.leetcode.leetcode_100_easy;

public class BuyAndSellStock_5 {
    public int maxProfit(int[] prices) {
        int maxprofit = 0, profit = 0;
        if(prices.length < 1) return 0;
        int st = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(st > prices[i]){
                st = prices[i];
                profit = 0;
            }else{
                profit += prices[i] - prices[i-1];
                maxprofit = Math.max(profit, maxprofit);
            }
        }
        return maxprofit;
    }
}
