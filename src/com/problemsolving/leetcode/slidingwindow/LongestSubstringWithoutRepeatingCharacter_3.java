package com.problemsolving.leetcode.slidingwindow;

/**
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubstringWithoutRepeatingCharacter_3 {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String str) {
        int arr[] = new int[128];
        int start = 0, res = 0, k = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)]++ > 0) {
                k--;
            }

            while (k<0) {
                if (--arr[str.charAt(start++)] > 0) {
                   k++;
                }
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}
