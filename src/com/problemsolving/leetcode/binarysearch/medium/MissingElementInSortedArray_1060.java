package com.problemsolving.leetcode.binarysearch.medium;

/**
 * Input: A = [4,7,9,10], K = 3
 * Output: 8
 * Explanation:
 * The missing numbers are [5,6,8,...], hence the third missing number is 8.
 */

public class MissingElementInSortedArray_1060 {
    public static int missingElement(int[] nums, int k) {
        int missing = 0 , n = nums.length;
        int start = 0, end = n - 1, mid, index = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int mcount = missingCount(nums, mid);
            if (mcount == k) {
                index = mid;
                break;
            } else if (mcount < k) {
                start = mid + 1;
            } else if (mcount > k) {
                index = mid;
                end = mid - 1;
            }
        }

        if (index == -1) {
            missing = k + nums[n -1] - missingCount(nums,n-1);
        } else {
            missing = nums[index] - missingCount(nums, index) - 1 + k;
        }

        return missing;
    }

    // This Method will Return Count Of Missing Number till that point
    public static int missingCount(int arr[], int x) {
        int count = 0;
        if (x < arr.length) {
            count = arr[x] - arr[0] - x;
        } else {
            count = arr[arr.length - 1] - arr[0] + (x - (arr.length - 1)) - (arr.length - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4, 7, 9, 10};
        int k = 4;
        System.out.println(missingElement(arr, k));
    }
}
