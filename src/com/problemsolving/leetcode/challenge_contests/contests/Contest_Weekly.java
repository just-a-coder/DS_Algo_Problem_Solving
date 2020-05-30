package com.problemsolving.leetcode.challenge_contests.contests;

import java.util.*;

public class Contest_Weekly {

    public static boolean hasAllCodes(String s, int k) {
        HashSet<String> binaryCodes = new HashSet<String>();
        for(int i = 0; i + k <= s.length(); ++i) {
            binaryCodes.add(s.substring(i, i+k));
        }

        double fullCount = Math.pow(2,k);
        return binaryCodes.size() == fullCount;
    }

    public static void main(String[] args) {
        String str = "00110";
        int k = 2;
        System.out.println(hasAllCodes(str, k));
    }
}
