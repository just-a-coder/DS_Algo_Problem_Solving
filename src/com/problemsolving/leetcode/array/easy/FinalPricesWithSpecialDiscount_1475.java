package com.problemsolving.leetcode.array.easy;

public class FinalPricesWithSpecialDiscount_1475 {
    public int[] finalPrices(int[] prices) {
        int result[] = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            result[i] = prices[i];
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] >= prices[j]){
                    result[i] -= prices[j];
                    break;
                }
            }
        }
        return result;
    }
}
