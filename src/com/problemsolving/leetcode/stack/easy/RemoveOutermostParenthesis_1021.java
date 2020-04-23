package com.problemsolving.leetcode.stack.easy;

import java.util.Stack;

public class RemoveOutermostParenthesis_1021 {
    public static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int count = 0, start = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(')
                count++;
            else
                count--;

            if (count == 0) {
                sb.append(S.substring(start+1,i));
                start = i+1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}
