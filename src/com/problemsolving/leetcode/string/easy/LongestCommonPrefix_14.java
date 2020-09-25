package com.problemsolving.leetcode.string.easy;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1) return "";
        String prefix =  strs[0];
        for(String st: strs){
            while(st.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
       // String str[] = {"flower","flow","flight"};
        String str[] = {"aa","a"};
        LongestCommonPrefix_14 ob = new LongestCommonPrefix_14();
        System.out.println(ob.longestCommonPrefix(str));
    }
}
