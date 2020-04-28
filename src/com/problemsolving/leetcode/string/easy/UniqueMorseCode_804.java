package com.problemsolving.leetcode.string.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode_804 {
    public static int uniqueMorseRepresentations(String[] words) {
        String table[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> hset = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                int num = ch - 'a';
                sb.append(table[num]);
            }
            hset.add(sb.toString());
        }
        return hset.size();
    }

    public static void main(String[] args) {
        String words[] = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
