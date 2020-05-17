package com.problemsolving.leetcode.array.medium;

import java.util.Arrays;
import java.util.Comparator;

public class RearrangeWordsInASequence_1451 {
    public static String arrangeWords(String text) {
        StringBuilder sb = new StringBuilder();
        String words[] = text.split(" ");
        words[0] = words[0].toLowerCase();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        words[0] = words[0].substring(0,1).toUpperCase()+words[0].substring(1);
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(words[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "Keep calm and code on";
        System.out.println(arrangeWords(text));
    }
}
