package com.problemsolving.leetcode.string.easy;

/**
 * Input: s = "RLLLLRRRLR"
 * Output: 3
 * Explanation: s can be split into "RL", "LLLRRR", "LR",
 * each substring contains same number of 'L' and 'R'.
 */
public class SplitAStringInBalancedString_1221 {
    public static int balancedStringSplit(String s) {
        int result  = 0, count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                ++count;
            } else {
                --count;
            }
            if (count == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        System.out.println(balancedStringSplit(s));
    }
}
