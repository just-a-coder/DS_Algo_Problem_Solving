package com.problemsolving.leetcode.string;

import java.util.Stack;

public class MinimumInsertionToBalanceParenthesis_1541 {
    public static int minInsertions(String s) {
        int result = 0;
        int slen = s.length();
        String str = s.replace("())","");
//        while (slen > str.length()) {
//            slen = str.length();
//            str = str.replace("())","");
//        }

        if(str.isEmpty()) return 0;

        char arr[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                if (st.isEmpty() || arr[i] == '(' || st.peek() == '(') {
                    st.push(arr[i]);
                } else {
                    int lcount = 0, rcount = 0;
                    while (!st.isEmpty()) {
                        if (st.pop() == '(') {
                            lcount++;
                        } else {
                            rcount++;
                        }
                    }
                    if (2 * lcount > rcount) {
                        result += 2 * lcount - rcount;
                    } else {
                        int div = rcount / 2 + 1;
                        result += div - lcount;
                        result += 2 * div - rcount;
                    }
                }
            } else {
                st.push(')');
            }
        }

        int lcount = 0, rcount = 0;
        while (!st.isEmpty()) {
            if (st.pop() == '(') {
                lcount++;
            } else {
                rcount++;
            }
        }

        if (2 * lcount > rcount) {
            result += 2 * lcount - rcount;
        } else {
            int div = rcount / 2 + 1;
            result += div - lcount;
            result += 2 * div - rcount;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "(()))(()))()())))";
        System.out.println(minInsertions(str));
    }
}
