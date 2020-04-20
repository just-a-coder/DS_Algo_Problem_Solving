package com.problemsolving.leetcode.slidingwindow;

/**
 * # 159
 * Input: "ccaabbb"
 * Output: 5
 * Explanation: t is "aabbb" which its length is 5.
 */
public class LengthOfLongestSubstringWithTwoDistinctChar_159 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(lengthOfLongestSubstringTwoDistinct(str));
    }

    public static int lengthOfLongestSubstringTwoDistinct(String str) {
        int arr[] = new int[128];
        int start = 0, res = 0, K = 2;

        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)]++ == 0) {
                K--;
            }

            while (K < 0) {
                if (--arr[str.charAt(start++)] == 0) {
                    K++;
                }
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}
