package com.problemsolving.leetcode.string.easy;

/**
 * Input: "Hello"
 * Output: "hello"
 */
public class ToLowerCase_709 {
    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 65 && str.charAt(i) <= 90)) {
                sb.append(Character.toString(str.charAt(i) + 32));
            } else {
                sb.append(Character.toString(str.charAt(i)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(toLowerCase(s));
    }
}
