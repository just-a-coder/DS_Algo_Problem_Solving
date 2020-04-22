package com.problemsolving.leetcode.stack.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
public class ValidParenthesis_20 {
    HashMap<Character,Character> hmap = new HashMap<>();
    public ValidParenthesis_20() {
        hmap.put(')','(');
        hmap.put('}','{');
        hmap.put(']','[');
    }

    public boolean isValid(String str)
    {
        while (str.contains("()") || str.contains("[]") || str.contains("{}"))
        {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        return str.length() == 0;
    }

/*    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hmap.containsKey(c)) {
                char top = (st.isEmpty())?'#':st.pop();
                if (hmap.get(c) != top) {
                    return false;
                }
            } else {
                st.push(c);
            }
        }
        return st.isEmpty();
    }*/

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "([)]";
        String s3 = "()[]{}";
        String s4 = "{{}[][[[]]]}";
        String s5 = "{{({})}}";
        String s6 = "{";
        ValidParenthesis_20 vp = new ValidParenthesis_20();
        System.out.println(vp.isValid(s4));
    }
}
