package com.problemsolving.leetcode.binarysearch.medium;

import java.util.Arrays;

/**
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 */
public class FindFirstAndLastPositionInASortedArray_34 {
    public static int[] searchRange(int[] nums, int target) {
        int arr[] = new int[]{-1,-1};
        if(nums.length == 0) return arr;
        arr[0] = findFirstIndex(nums, target);
        arr[1] = findLastIndex(nums, target);
        return arr;
    }

    public static int findFirstIndex(int arr[], int target) {
        int low = 0, high = arr.length-1, mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        if (low != arr.length && arr[low] == target) return low;
        return -1;
    }

    public static int findLastIndex(int arr[], int target) {
        int low = 0, high = arr.length - 1, mid;
        while (low < high) {
            mid = low + (high - low + 1) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        if (low != arr.length && arr[low] == target) return low;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0};
        int k = 3;
        System.out.println(Arrays.toString(searchRange(arr, k)));
    }
}
