package com.problemsolving.hackerrank.algo.easy;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 2, 6, 1, 2};
        int k = 3;
        int result = divisibleSumPairs(arr.length,k,arr);
        System.out.println(result);
    }

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int ijsum = ar[i] + ar[j];
                if (ijsum % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }

}
