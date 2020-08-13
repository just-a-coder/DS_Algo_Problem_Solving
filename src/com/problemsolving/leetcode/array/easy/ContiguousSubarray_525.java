package com.problemsolving.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: [1,1,0,0,1,1,0]
 * Output: 6
 */
public class ContiguousSubarray_525 {
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int count = 0, maxlength = 0;
        hmap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1 ? 1 : -1);
            if (hmap.containsKey(count)) {
                maxlength = Math.max(maxlength, i - hmap.get(count));
            }
            hmap.putIfAbsent(count, i);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 1, 1};
        System.out.println(findMaxLength(arr));
    }
}

/**
 * New Concept Alert:
 * Here We are trying to store the count inside one map as key and corresponding index of i as value.
 * At any point of time if count is 0, then that means from begging to that index, Num of
 * 0 and 1 is same.
 * And also if for two different index we are getting same count that means last index - starting index
 * will be having same 0,1.
 * Now, Map is used to store the previous index value, once we counter the same count value we will pull
 * the index from map and derive the length.
 * Max function is used to get the max length.
 * To Make this thing work, we are going to convert all 0 as -1.
 * Count is initially zero when there are no elements in the array. And after iterating a few elements,
 * when the first time count actually becomes 0 then we will need an index
 * to work Math.max(maxlen, i - map.get(0)). That's why we are adding hmap.put(0,-1)
 */
