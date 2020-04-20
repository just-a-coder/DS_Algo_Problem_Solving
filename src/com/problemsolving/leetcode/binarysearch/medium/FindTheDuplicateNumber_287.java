package com.problemsolving.leetcode.binarysearch.medium;

import java.util.Arrays;

/**
 * Input: [1,3,4,2,2]
 * Output: 2
 */
public class FindTheDuplicateNumber_287 {
    public static int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
