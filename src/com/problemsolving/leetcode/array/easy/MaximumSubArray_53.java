package com.problemsolving.leetcode.array.easy;

public class MaximumSubArray_53 {
    // Greedy
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE, localMax = 0;
        for(int i = 0; i < nums.length; i++){
            localMax = Math.max(nums[i], localMax+nums[i]);
            result = Math.max(localMax, result);
        }
        return result;
    }

    // Using DP
    public int maxSubArrayDP(int[] nums) {
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] > 0) nums[i] += nums[i-1];
            result = Math.max(nums[i], result);
        }
        return result;
    }
}
