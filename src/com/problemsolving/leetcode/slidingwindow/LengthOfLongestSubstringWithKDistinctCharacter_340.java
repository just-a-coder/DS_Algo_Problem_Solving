package com.problemsolving.leetcode.slidingwindow;

/**
 * #340
 */
public class LengthOfLongestSubstringWithKDistinctCharacter_340 {
    public int lengthOfLongestSubstringKDistinct(String str, int k) {
        int arr[] = new int[128];
        int res = 0, start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)]++ == 0) {
                k--;
            }

            while (k < 0) {
                if (--arr[str.charAt(start++)] == 0) {
                    k++;
                }
            }
            res = Math.max(res, i-start+1);
        }
        return res;
    }
}
