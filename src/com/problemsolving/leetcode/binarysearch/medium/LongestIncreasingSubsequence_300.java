package com.problemsolving.leetcode.binarysearch.medium;

public class LongestIncreasingSubsequence_300 {
    public static int lengthOfLIS(int[] nums) {
        int lis[] = new int[nums.length];
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int index = binarySearch(lis, 0, len, nums[i]);
            if (index < 0) {
                index = -(index + 1);
            }
            lis[index] = nums[i];
            if (index == len) {
                len += 1;
            }
        }
        return len;
    }

    private static int binarySearch(int arr[], int fromIndex, int toIndex, int k) {
        int low = fromIndex, high = toIndex - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -(low + 1);
    }

    public static void main(String[] args) {
        int nums[] = new int[]{4,8,4,12,2};
        System.out.println(lengthOfLIS(nums));
    }
}
