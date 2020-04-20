package com.problemsolving.leetcode.binarysearch.easy;

import java.util.Arrays;

/**
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSum_167 {
    public static int[] twoSum(int[] arr, int k) {
        int resarr[] = new int[2];
        int start = 0, end = arr.length - 1, mid, sum = 0;
        while (start <= end) {
            sum = arr[start] + arr[end];
            if (sum == k) {
                resarr[0] = start + 1;
                resarr[1] = end + 1;
                break;
            } else if (sum > k) {
                end--;
            } else if (sum < k) {
                start++;
            }
        }
        return resarr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 7, 11, 15};
        int k = 9;
        int resarr[] = twoSum(arr, k);
        System.out.println(Arrays.toString(resarr));
    }
}
