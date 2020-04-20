package com.problemsolving.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumSubArray {
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{-2,0,-3,7,-1};
        List<Integer> alist = Arrays.asList(arr);
        int result = maxSubArray(alist);
        System.out.println(result);
    }

    public static int maxSubArray(final List<Integer> A) {
        int sum = A.get(0), maxSum = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            if (sum < 0) {
                sum = A.get(i);
            } else if (sum >= 0) {
                sum = sum + A.get(i);
            }

            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
