package com.problemsolving.leetcode.string.easy;

import java.util.Arrays;

public class ReverseString_344 {
    public static void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        int start = 0, end = s.length -1;
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        String s = "hello";
        reverseString(s.toCharArray());
    }
}
