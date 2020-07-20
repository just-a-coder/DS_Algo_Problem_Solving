package com.problemsolving.leetcode.slidingwindow;

/**
 * #424
 * Input:
 * s = "ABAB", k = 2
 * Output: 4
 * Explanation:
 * Replace the two 'A's with two 'B's or vice versa.
 */
public class LongestRepeatingCharacterReplacement_424 {
    public static int characterReplacement(String str, int k) {
        int n = str.length();
        if (n == 0) {
            return 0;
        }

        int[] arr = new int[128];
        int maxfreq = 0;
        int start = 0, res = 0;
        for (int i = 0; i < n; i++) {
            int count = ++arr[str.charAt(i)];
            maxfreq = Math.max(maxfreq, count);
            if ( i - start + 1 - maxfreq > k) {
                --arr[str.charAt(start++)];
            }
            res = Math.max(res, i-start+1);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "BAAA";
        int k = 0;
        System.out.println(characterReplacement(str, k));
    }

}

/**
 * The idea is that the window never needs to shrink. After the length of the substring expands
 * to maximum, when we add one more char, if it is the char with the maximum occurrence,
 * nothing changes, otherwise, the length of the substring increases but max + k doesn't,
 * so we need to move window leftward (start++). In the following rounds, until we find another
 * char has more occurrence, we only need to move window to keep the max length correct.
 * So "max" here is defined
 * as the maximum occurrence seen so far, not the maximum occurrence in current window.
 */
