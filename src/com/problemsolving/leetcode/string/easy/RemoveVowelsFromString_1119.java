package com.problemsolving.leetcode.string.easy;

import java.util.Iterator;

public class RemoveVowelsFromString_1119 {
    public static String removeVowels(String S) {
        StringBuilder sb = new StringBuilder(S);
        int i = 0;
        while (i < sb.length()) {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e'
                    || sb.charAt(i) == 'i' || sb.charAt(i) == 'o'
                    || sb.charAt(i) == 'u') {
                sb.deleteCharAt(i);
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "leetcodeisacommunityforcoders";
        System.out.println(removeVowels(s));
    }
}
