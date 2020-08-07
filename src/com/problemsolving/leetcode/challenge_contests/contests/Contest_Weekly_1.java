package com.problemsolving.leetcode.challenge_contests.contests;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Contest_Weekly_1 {

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;
        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = i + 1; j <= arr.length - 2; j++) {
                for (int k = j + 1; k <= arr.length - 1; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                            Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{7, 3, 7, 3, 12, 1, 12, 2, 3};
        int a = 5, b = 8, c = 1;
        System.out.println(countGoodTriplets(arr, a, b, c));
    }
}
