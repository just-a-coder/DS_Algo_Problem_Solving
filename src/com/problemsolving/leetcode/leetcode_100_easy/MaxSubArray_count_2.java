package com.problemsolving.leetcode.leetcode_100_easy;

public class MaxSubArray_count_2 {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = Math.max(sum+nums[i], nums[i]);
            result = Math.max(result, sum);
        }
        return result;
    }
}
