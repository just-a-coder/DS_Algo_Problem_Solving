package com.problemsolving.leetcode.binarysearch.easy;

public class BasicStructureForBinarySearch {
    public static int findMethod(int arr[], int k) {
        int start = 0, end = arr.length - 1, res = 0, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(findMethod(arr, k));
    }
}
