package com.problemsolving.leetcode.binarysearch.easy;

public class FixedPoint_1064 {
    public static int fixedPoint(int[] arr) {
        int start = 0, end = arr.length - 1, mid, res = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == mid) {
                res = mid;
                end = mid - 1;
            } else if (arr[mid] < mid) {
                start = mid + 1;
            } else if (arr[mid] > mid) {
                end = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-10};
        System.out.println(fixedPoint(arr));
    }
}
