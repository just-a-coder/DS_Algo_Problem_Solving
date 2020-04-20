package com.problemsolving.leetcode.slidingwindow;

/**
 * #1004
 * Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
 * Output: 6
 * Explanation:
 * [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
 */
public class MaxConsecutiveOneIII_1004 {

    public static int longestOnes(int[] arr, int k) {
        int res = 0, start = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                k--;
            }

            while (k < 0) {
                if (arr[start++] == 0) {
                    k++;
                }
            }
            res = Math.max(res, i-start+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(arr, k));
    }
}
