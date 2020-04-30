package com.problemsolving.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons_1189 {
    public static int maxNumberOfBalloons(String text) {
        char chararr[] = text.toCharArray();
        Map<Character,Integer> hmap = new HashMap<>();
        hmap.put('b',0);
        hmap.put('a',0);
        hmap.put('l',0);
        hmap.put('o',0);
        hmap.put('n',0);
        for (int i = 0; i < chararr.length; i++) {
            if (hmap.containsKey(chararr[i])) {
                hmap.put(chararr[i],hmap.getOrDefault(chararr[i],0)+1);
            }
        }
        int minvalue = Integer.MAX_VALUE;
        for (char ch : hmap.keySet()) {
            int currvalue =0;
            if (ch == 'l' || ch == 'o') {
                currvalue = hmap.get(ch) / 2;
            } else {
                currvalue = hmap.get(ch);
            }
            minvalue = Math.min(minvalue,currvalue);
        }
        return minvalue;
    }

    public static void main(String[] args) {
        String text = "loonb";
        System.out.println(maxNumberOfBalloons(text));
    }
}
