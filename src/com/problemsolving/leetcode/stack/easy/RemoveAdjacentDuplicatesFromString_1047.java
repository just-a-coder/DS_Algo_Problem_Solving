package com.problemsolving.leetcode.stack.easy;

import java.util.Stack;

public class RemoveAdjacentDuplicatesFromString_1047 {
    public String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (st.isEmpty()||st.peek()!=c) {
                st.push(c);
            } else {
                if (st.peek() == c) {
                    st.pop();
                }
            }
        }

        while (!st.isEmpty()) {
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveAdjacentDuplicatesFromString_1047 ob = new RemoveAdjacentDuplicatesFromString_1047();
        String s = "cabbacaccab";
        System.out.println(ob.removeDuplicates(s));
    }
}
