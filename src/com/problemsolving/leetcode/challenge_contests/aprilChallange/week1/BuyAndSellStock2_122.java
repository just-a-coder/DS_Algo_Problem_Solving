package com.problemsolving.leetcode.challenge_contests.aprilChallange.week1;

/**
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 *              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 */
public class BuyAndSellStock2_122 {
	public static int maxProfit(int[] prices) {
		int maxProfit = 0, start = -1;
		int n = prices.length, i=0;
		for (; i < n-1; i++) {
			if ((prices[i]<prices[i+1]) && start<0) {
				start = i;
				continue;
			}
			if (start>=0 && prices[i] > prices[i + 1]) {
				maxProfit += (prices[i] - prices[start]);
				start = -1;
			}
		}
        if (i == n - 1 && start>=0) {
            maxProfit += (prices[i] - prices[start]);
        }
		return maxProfit;
	}

	public static void main(String[] args) {
		int prices[] = new int[] {1,2,3,4,5};
		System.out.println(maxProfit(prices));
	}

}
