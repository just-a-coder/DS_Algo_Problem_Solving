package com.problemsolving.leetcode.challenge_contests.contests;

import java.util.*;

public class Contest_Weekly {

    public static List<String> buildArray(int[] target, int n) {
        List<String> alist = new ArrayList<>();
        int i = 1;
        int targeti = i - 1;
        for (; i <= n; i++) {
            if (i > target.length && i>target[target.length-1]) {
                break;
            }
            if (target[targeti] == i) {
                alist.add("Push");
                targeti++;
            } else if (target[targeti] > i) {
                alist.add("Push");
                alist.add("Pop");
            }
        }
        return alist;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 3};
        int n = 3;
        System.out.println(buildArray(arr, n));

    }
}
