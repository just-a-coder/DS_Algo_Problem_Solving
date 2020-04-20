package com.problemsolving.leetcode.binarysearch.medium;

import java.util.Arrays;

/**
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 */
public class FindFirstAndLastPositionInASortedArray_36 {
    public static int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = findFirstIndex(nums,target);
        arr[1] = findLastIndex(nums,target);
        return arr;
    }

    public static int findFirstIndex(int arr[], int k) {
        int start = 0, n = arr.length, end = n - 1, mid, index = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                index = mid;
                end = mid - 1;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else if (arr[mid] < k) {
                start = mid + 1;
            }
        }
        return index;
    }

    public static int findLastIndex(int arr[], int k) {
        int start = 0, n = arr.length, end = n - 1, mid, index = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                index = mid;
                start = mid + 1;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else if (arr[mid] < k) {
                start = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5, 7, 7, 8, 8, 10};
        int k = 11;
        System.out.println(Arrays.toString(searchRange(arr, k)));
    }
}
