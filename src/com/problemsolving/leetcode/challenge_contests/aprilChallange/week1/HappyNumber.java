package com.problemsolving.leetcode.challenge_contests.aprilChallange.week1;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {
    public static boolean isHappy(int n) {
        int num = n;
        Map<Integer, Integer> hmap = new HashMap<>();
        while (num != 1) {
            int sum = 0;
            while (num > 0) {
                int mod = num % 10;
                sum += Math.pow(mod, 2);
                num = num / 10;
            }
            if (hmap.containsKey(sum)) {
                return false;
            } else {
                hmap.put(sum, 1);
            }
            num = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
