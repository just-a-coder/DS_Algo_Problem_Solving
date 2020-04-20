package com.problemsolving.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class MaximumSizeSubArrayEqualsSumK {
    public static int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        /**
         * Note the map.put(0, -1). We need to put this entry into the map before,
         * because if the maximal range starts from 0, we need to calculate sum(j) - sum(i - 1).
         */
        hmap.put(0, -1);
        int sum = 0, maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            /**
             * if we encounter the same sum-k twice while traversing the array,
             * it means that the between these two index we will get sum = k
             */
            if (hmap.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - hmap.get(sum - k));
            }
            // If already that sum is there,
            // then it means previous index should be the starting index instead of this.
            hmap.putIfAbsent(sum, i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(maxSubArrayLen(arr, k));
    }
}

/**
 *
 * We use a map, the key is the sum we get from index 0 to index i, and the value is index i.
 * If we find sum - k
 * is also in the map, we know there exists a subarray with sum k,
 * and we compare it with the previous result.
 *
 * Sliding window does not work for this problem because:
 * Skipped part of the window may also contribute to a maxSize subarray.
 * Move right does not make the sum bigger, move left does not make the sum smaller.
 * because number can be positive or negative.
 */