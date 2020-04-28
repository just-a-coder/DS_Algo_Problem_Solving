package com.problemsolving.leetcode.string.easy;

import java.util.Arrays;

public class ReverseWordsInString3_557 {
    public static String reverseWords(String words) {
        String wordarr[] = words.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word: wordarr) {
            sb.append(reverseWord(word)+" ");
        }
        return sb.toString().trim();
    }

    public static String reverseWord(String word) {
        StringBuilder revsb = new StringBuilder();
        char arr[] = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            revsb.insert(0,arr[i]);
        }
        return revsb.toString();
    }

    public static void main(String[] args) {
        String s = "AB CDE FG";
        System.out.println(reverseWords(s));
    }
}
