package com.problemsolving.leetcode.binarysearch.easy;

/**
 * n = 5
 * The coins can form the following rows: o/p = 2
 * ¤
 * ¤ ¤
 * ¤ ¤
 */
public class ArrangingCoins_441 {
    public static int arrangeCoins(int n) {
        long start = 0, end = n, mid, k;
        while (start <= end) {
            mid = start + (end-start)/2;
            k = mid * (mid + 1) / 2;
            if ( k== n) {
                return (int)mid;
            } else if (k > n) {
                end = mid-1;
            } else if (k < n) {
                start = mid+1;
            }
        }
        return (int)end;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }
}

/**
 * For n = 8, the array looks like
 * 1 3 6 10
 * where n comes in between 6 & 10.
 * so it's not directly matching with existing value. We need to return index of 6.
 * As we know, once loop finishes in case of data not found.
 * High becomes Low and Low becomes High.
 * In this Case end = 6 and start = 10 once loop is over
 * that's why in the end we are returning end
 */
