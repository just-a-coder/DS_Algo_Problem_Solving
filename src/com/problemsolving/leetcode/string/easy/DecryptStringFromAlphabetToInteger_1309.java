package com.problemsolving.leetcode.string.easy;

public class DecryptStringFromAlphabetToInteger_1309 {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                int temp = 10 * Integer.parseInt(String.valueOf(s.charAt(i - 2)))
                        + Integer.parseInt(String.valueOf(s.charAt(i - 1)));
                sb.insert(0, (char)(temp+96));
                i = i - 3;
            } else {
                int temp = Integer.parseInt(String.valueOf(s.charAt(i)));
                sb.insert(0, (char)(temp+96));
                i--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
}
