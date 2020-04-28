package com.problemsolving.leetcode.string.easy;

/**
 * Input: S = "aaaba"
 * Output: 8
 * Explanation: The substrings with one distinct letter are "aaa", "aa", "a", "b".
 * "aaa" occurs 1 time.
 * "aa" occurs 2 times.
 * "a" occurs 4 times.
 * "b" occurs 1 time.
 * So the answer is 1 + 2 + 4 + 1 = 8.
 */
public class CountDistinctLetters_1180 {
    public static int countLetters(String S) {
        int totalcount = 1, currentCount = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i-1)) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            totalcount += currentCount;
        }
        return totalcount;
    }

    public static void main(String[] args) {
        String s = "aaaaaaaaaa";
        System.out.println(countLetters(s));
    }
}
