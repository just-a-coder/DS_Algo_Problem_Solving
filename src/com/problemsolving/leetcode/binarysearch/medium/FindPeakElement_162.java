package com.problemsolving.leetcode.binarysearch.medium;

/**
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 1 or 5
 */
public class FindPeakElement_162 {
    public static int findPeakElement(int[] arr) {
        int low = 0, high = arr.length - 1, mid;
        while (low < high) {
            mid = low + (high - low + 1) / 2;
            if (arr[mid] < arr[mid - 1]) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 2};
        System.out.println(findPeakElement(arr));
    }
}
