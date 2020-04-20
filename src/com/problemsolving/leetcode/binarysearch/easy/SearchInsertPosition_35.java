package com.problemsolving.leetcode.binarysearch.easy;

public class SearchInsertPosition_35 {
    public static int searchInsert(int arr[], int k) {
        int start = 0, end = arr.length - 1, res = 0, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else if (arr[mid] < k) {
                res = mid+1;
                start = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 5, 6};
        int k = 0;
        System.out.println(searchInsert(arr, k));
    }
}
