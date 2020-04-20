package com.problemsolving.leetcode.binarysearch.medium;

/**
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 1 or 5
 */
public class FindPeakElement_162 {
    public static int findPeakElement(int[] arr) {
        int start = 0, n = arr.length, end = n - 1, mid;
        if (n == 1)
            return 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid] < arr[mid - 1]) {
                    end = mid - 1;
                } else if (arr[mid] < arr[mid + 1]) {
                    start = mid + 1;
                }
            } else if (mid == 0) {
                if (arr[0] > arr[1]) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (mid == n - 1) {
                if (arr[end] > arr[end - 1]) {
                    return end;
                } else {
                    return end - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,1};
        System.out.println(findPeakElement(arr));
    }
}
