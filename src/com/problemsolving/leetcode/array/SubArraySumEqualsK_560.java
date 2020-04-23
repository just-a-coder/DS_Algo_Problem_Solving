package com.problemsolving.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK_560 {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, 1);
        int count = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (hmap.containsKey(sum - k)) {
                count += hmap.get(sum - k);
            }
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0, 0, 0, 0};
        int k = 0;
        System.out.println(subarraySum(arr, k));
    }

}
