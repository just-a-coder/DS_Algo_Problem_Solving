package com.problemsolving.leetcode.binarysearch.hard;

/**
 * Input:
 * nums = [7,2,5,10,8]
 * m = 2
 * Output:
 * 18
 */
public class SplitArrayLargestSum_410 {
    public static int splitArray(int[] nums, int m) {
        int start = Integer.MIN_VALUE, end = 0, mid, res = 0;
        if (nums.length == 2 && m == 2) {
            return (nums[0]>nums[1])?nums[0]:nums[1];
        } else if (nums.length == 2 && m == 1) {
            return (nums[0]+nums[1]);
        }

        for (int i = 0; i < nums.length; i++) {
            end += nums[i];
            start = Math.max(start, nums[i]);
        }

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isValid(nums, m, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    private static boolean isValid(int[] nums, int m, int max) {
        int sum = 0, count = 1;
        int maxvalue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > max) {
                maxvalue = Math.max(maxvalue, sum);
                sum = nums[i];
                count++;
                if (count > m) {
                    return false;
                }
            } else {
                sum += nums[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int m = 2;
        System.out.println(splitArray(arr, m));
    }
}
