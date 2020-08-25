package com.problemsolving.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumberDisappearedFromArray_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;
            nums[idx] = - nums[idx];
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) result.add(i+1);
        }
        return result;
    }
}
