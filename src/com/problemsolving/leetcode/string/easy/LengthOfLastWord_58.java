package com.problemsolving.leetcode.string.easy;

public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        if(arr.length < 1) return 0;
        return arr[arr.length-1].length();
    }
}
