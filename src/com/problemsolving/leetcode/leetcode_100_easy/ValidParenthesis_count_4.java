package com.problemsolving.leetcode.leetcode_100_easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis_count_4 {
    public boolean isValid(String s) {
        Map<Character, Character> hmap = new HashMap<>();
        hmap.put(')','(');
        hmap.put('}','{');
        hmap.put(']','[');
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(hmap.containsKey(s.charAt(i))){
                if(st.isEmpty() || st.pop() != hmap.get(s.charAt(i))){
                    return false;
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        return (st.size()  == 0);
    }
}
