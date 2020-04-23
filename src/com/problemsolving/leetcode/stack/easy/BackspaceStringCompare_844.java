package com.problemsolving.leetcode.stack.easy;

import java.util.Stack;

/**
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 */
public class BackspaceStringCompare_844 {
    public static boolean backspaceCompare(String S, String T) {
        return getStringBuilder(S).compareTo(getStringBuilder(T))==0;
    }

    private static StringBuilder getStringBuilder(String S) {
        StringBuilder sbS = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '#' && !st.isEmpty()) {
                st.pop();
            }
            if (c != '#') {
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            sbS.insert(0,st.pop());
        }
        return sbS;
    }

    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }
}
