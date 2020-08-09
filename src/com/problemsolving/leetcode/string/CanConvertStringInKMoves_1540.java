package com.problemsolving.leetcode.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CanConvertStringInKMoves_1540 {
    public static boolean canConvertString(String s, String t, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = s.length(), n = t.length(), prev = 0;
        if (m != n) return false;
        for (int i = 0; i < m; i++) {
            int dist = getDist(s.charAt(i), t.charAt(i));
            // When S & T has same value, No need to Check
            if (dist == 0) continue;
            // Key is used to check dist is already there, Value is used to check total dist value
            int prevCnt = map.getOrDefault(dist, 0);
            map.put(dist, prevCnt + 1);
            if (prevCnt * 26 + dist > k) return false;  // find next available move
        }
        return true;
    }

    private static int getDist(char a, char b) {
        int dist = b - a;
        return (dist + 26) % 26;
    }


    public static void main(String[] args) {
        String s = "aa";
        String t = "bb";
        int k = 9;
        System.out.println(canConvertString(s, t, k));
    }
}