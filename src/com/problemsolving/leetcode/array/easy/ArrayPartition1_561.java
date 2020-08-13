package com.problemsolving.leetcode.array.easy;

import java.util.Arrays;

public class ArrayPartition1_561 {
    public int arrayPairSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int sum = 0;
        for(int i =0; i < nums.length; i+=2){
            sum += Math.min(nums[i] , nums[i+1]);
        }
        return sum;
    }
}
