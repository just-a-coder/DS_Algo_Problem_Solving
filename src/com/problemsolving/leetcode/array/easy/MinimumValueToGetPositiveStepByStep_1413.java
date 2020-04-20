package com.problemsolving.leetcode.array.easy;

/**
 * Input: nums = [-3,2,-3,4,2]
 * Output: 5
 * Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
 *                 step by step sum
 *                 startValue = 4 | startValue = 5 | nums
 *                   (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
 *                   (1 +2 ) = 3  | (2 +2 ) = 4    |   2
 *                   (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
 *                   (0 +4 ) = 4  | (1 +4 ) = 5    |   4
 *                   (4 +2 ) = 6  | (5 +2 ) = 7    |   2
 */
public class MinimumValueToGetPositiveStepByStep_1413 {
    public static int minStartValue(int[] arr) {
        int sum = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            res = Math.min(sum, res);
        }
        if(res<0) return -(res)+1;
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-3,2,-3,4,2};
        System.out.println(minStartValue(arr));
    }
}
