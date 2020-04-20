package com.problemsolving.leetcode.binarysearch.easy;

/**
 * Input: [0,2,1,0]
 * Output: 1
 */
public class PeakIndexInMountainArray_852 {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0, end = n-1, mid;
        if (n < 3) {
            return -1;
        }

        while (start <= end) {
            mid = (start+(end-start)/2);
            if (mid > 0 && mid < n-1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                   return mid;
                } else if (arr[mid] < arr[mid - 1]) {
                    end = mid-1;
                } else if (arr[mid] < arr[mid + 1]) {
                    start = mid+1;
                }
            }
            if (mid == 0) {
                if (arr[0] > arr[1]) {
                    return 0;
                } else {
                    return 1;
                }
            }
            if (mid == n - 1) {
                if (arr[n-1] > arr[n-2]) {
                    return n-1;
                } else {
                    return n-2;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0,2,1,0};
        // Same Peak Element Problem
        System.out.println(peakIndexInMountainArray(arr));
    }
}
