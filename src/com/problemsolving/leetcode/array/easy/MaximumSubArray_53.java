package com.problemsolving.leetcode.array.easy;

public class MaximumSubArray_53 {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE, localMax = 0;
        for(int i = 0; i < nums.length; i++){
            localMax = Math.max(nums[i], localMax+nums[i]);
            result = Math.max(localMax, result);
        }
        return result;
    }
}
