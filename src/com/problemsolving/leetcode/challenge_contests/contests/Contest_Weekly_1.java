package com.problemsolving.leetcode.challenge_contests.contests;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Contest_Weekly_1 {

    public static int minDiff(List<Integer> arr) {
        Collections.sort(arr);
        int result = 0;
        for (int i = 0; i < arr.size() -1; i++) {
             result += arr.get(i+1) - arr.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> alist = Arrays.asList(new Integer[]{1,3,3,2,4});
        System.out.println(minDiff(alist));
    }
}
