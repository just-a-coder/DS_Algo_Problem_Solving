package com.problemsolving.leetcode.challenge_contests.mayChallenge.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        int lens = s.length(), lenp = p.length();
        List<Integer> alist = new ArrayList<>();
        if(lens<lenp) return alist;
        char parr[] = new char[26];
        for (int i = 0; i < lenp; i++) {
            char ch = p.charAt(i);
            parr[ch-'a']++;
        }

        char sarr[] = new char[26];
        for (int i = 0; i < lens; i++) {
            char ch = s.charAt(i);
            sarr[ch - 'a']++;

            if (i >= lenp) {
                sarr[s.charAt(i-lenp)-'a']--;
            }

            if (Arrays.equals(sarr, parr)) {
                alist.add(i-lenp+1);
            }
        }
        return alist;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(Arrays.toString(findAnagrams(s, p).toArray()));
    }
}
