package com.problemsolving.leetcode.string.easy;

public class GoatLatin_824 {
    public static String toGoatLatin(String S) {
        String vowel = "a,e,i,o,u,A,E,I,O,U";
        StringBuilder sb = new StringBuilder();
        String words[] = S.split(" ");
        for (int i = 0; i < words.length; i++) {
            String ch = String.valueOf(words[i].charAt(0));
            if (vowel.contains(ch)) {
                words[i] = words[i] + "ma";
            } else {
                words[i] = words[i].substring(1) + words[i].charAt(0) + "ma";
            }
            for (int x = 0; x <= i; x++) {
                words[i] = words[i] + 'a';
            }
            if (i == words.length - 1)
                sb.append(words[i]);
            else
                sb.append(words[i] + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        System.out.println(toGoatLatin(s));
    }
}
