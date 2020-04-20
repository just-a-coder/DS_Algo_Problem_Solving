package com.problemsolving.leetcode.binarysearch.medium;

/**
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 */
public class SearchInARotatedSortedArray2_81 {
    public static boolean search(int[] arr, int k) {
        int n = arr.length, start = 0, end = n - 1, mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == k || arr[start] == k || arr[end] == k) return true;

            if (arr[mid] > arr[end]) { // It means left side of array is sorted.
                if(arr[start]<k && arr[mid]>k) end = mid-1;
                else start = mid+1;
            } else if (arr[mid] < arr[end]) { // It means right side of array is sorted.
                if(arr[mid]<k && arr[end]>k) start = mid+1;
                else end = mid -1;
            } else {
                end--;
                /**
                 *  It can be start++ or end--, as both side are not sorted and we already checked with k low/high.
                 *  So ignoring one and starting the process again.
                 */
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,0,1,1,1,1,1};
        int k = 1;
        System.out.println(search(arr, k));
    }
}
