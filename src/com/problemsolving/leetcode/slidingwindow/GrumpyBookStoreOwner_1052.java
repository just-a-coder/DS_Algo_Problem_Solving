package com.problemsolving.leetcode.slidingwindow;

/**
 * #1052
 * custom = [1,0,1,2,1,1,7,5],
 * grumpy = [0,1,0,1,0,1,0,1],
 * X = 3
 */
public class GrumpyBookStoreOwner_1052 {
    public int maxSatisfied(int[] c, int[] g, int X) {
        int n = c.length;
        int sum = 0, msum = 0;

        for (int i = 0; i < n; i++) {
            sum += (g[i] == 0) ? c[i] : 0;
        }

        for (int i = 0; i < X; i++) {
            sum += (g[i] == 1) ? c[i] : 0;
        }
        msum = sum;

        for (int start = 0, end = X; end < n; start++, end++) {
            sum += (g[end] == 1) ? c[end] : 0;
            sum -= (g[start] == 1) ? c[start] : 0;
            msum = Math.max(sum, msum);
        }
        return msum;
    }
}
