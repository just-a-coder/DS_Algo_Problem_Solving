package com.problemsolving.leetcode.challenge_contests.mayChallenge.week3;

public class MaxSubArraySumOfCircularArray {
    public static int maxSubarraySumCircular(int[] A) {
        int maxSum = 0;
        int maxKadane = kadane(A);
        for (int i = 0; i < A.length; i++) {
            maxSum += A[i];
           A[i] = -A[i];
        }
        maxSum += kadane(A);
        if (maxSum > maxKadane && maxSum != 0) {
            return maxSum;
        } else {
            return maxKadane;
        }
    }

    private static int kadane(int[] a) {
        int localsum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
           localsum = Math.max(a[i], a[i]+localsum);
            maxSum = Math.max(localsum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-1,-2,-3};
        System.out.println(maxSubarraySumCircular(arr));
    }
}
