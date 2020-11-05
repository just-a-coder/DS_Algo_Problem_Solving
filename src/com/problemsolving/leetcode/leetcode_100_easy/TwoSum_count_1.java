package com.problemsolving.leetcode.leetcode_100_easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_count_1 {
    public static void main(String[] args) {
        int arr[] = new int[]{2,7,11,15};
        int target = 9;
        TwoSum_count_1 ob = new TwoSum_count_1();
        System.out.println(ob.twoSum(arr, target));
    }

    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hmap.containsKey(target - nums[i])){
                result[0] = hmap.get(target - nums[i]);
                result[1] = i;
                break;
            }else{
                hmap.put(nums[i], i);
            }
        }
        return result;
    }
}
