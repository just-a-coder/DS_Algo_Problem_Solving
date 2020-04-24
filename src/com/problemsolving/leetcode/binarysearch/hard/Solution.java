package com.problemsolving.leetcode.binarysearch.hard;

class Solution {
    public int splitArray(int[] nums, int m) {
        int max1 = 0, sum = 0;
        for (int num : nums) {
            max1 = Math.max(num, max1);
            sum += num;
        }
        //the largest sum will between [max, sum], the search space is defined
        int low = max1, high = sum;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canSplit(nums, m - 1, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canSplit(int[] nums, int m, int target) {
        int split = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > target) {
                split++;
                sum = nums[i];
                if (split > m) {
                    return false;
                }
            } else {
                sum += nums[i];
            }
        }
        return true;
    }
}
