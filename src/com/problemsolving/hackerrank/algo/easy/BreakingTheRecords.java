package com.problemsolving.hackerrank.algo.easy;

public class BreakingTheRecords {

    public static void main(String[] args) {
        int arr[] = new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1};
        int resultarr[] = breakingRecords(arr);
        System.out.println(resultarr[0] + " " + resultarr[1]);
    }

    static int[] breakingRecords(int[] scores) {
        int min = scores[0], max = scores[0];
        int resultarr[] = new int[2];
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
                resultarr[0] = resultarr[0] + 1;
            }
            if (min > scores[i]) {
                min = scores[i];
                resultarr[1] = resultarr[1] + 1;
            }
        }
        return resultarr;
    }
}
