package com.problemsolving.leetcode.slidingwindow;

/**
 * Input: s = "abcd", t = "bcdf", maxCost = 3
 * Output: 3
 * Explanation: "abc" of s can change to "bcd". That costs 3, so the maximum length is 3.
 */
public class EqualSubstringWithinBudget_1208 {
    public static int equalSubstring(String s, String t, int maxCost) {
        int cost = 0, res = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            cost += Math.abs(s.charAt(i) - t.charAt(i));
            if (cost <= maxCost) {
                res = Math.max(i - start + 1, res);
            } else {
                cost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
        }
        return res;
    }

    public static int equalSubstringWithArray(String s, String t, int maxCost) {
        int cost = 0, res = 0, start = 0;
        int costarr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            costarr[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            cost += costarr[i];
            if (cost <= maxCost) {
                res = Math.max(i - start + 1, res);
            } else {
                cost -= costarr[start++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "cdef";
        int maxCost = 3;
        System.out.println(equalSubstring(s, t, maxCost));
    }
}
