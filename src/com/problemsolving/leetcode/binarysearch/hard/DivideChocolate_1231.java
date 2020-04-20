package com.problemsolving.leetcode.binarysearch.hard;

/**
 * Input: sweetness = [1,2,3,4,5,6,7,8,9], K = 5
 * Output: 6
 * Explanation: You can divide the chocolate to [1,2,3], [4,5], [6], [7], [8], [9]
 */
public class DivideChocolate_1231 {
    public static int maximizeSweetness(int[] arr, int K) {
        int start = Integer.MIN_VALUE, end = 0, mid, res = 0;
        K = K + 1;
        for (int i = 0; i < arr.length; i++) {
            end += arr[i];
            start = 1;
        }

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isValid(arr, K, mid)) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    private static boolean isValid(int arr[], int k, int min) {
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum >= min) {
                count++;
                sum = 0;
                if (count == k) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 5;
        System.out.println(maximizeSweetness(arr, k));
    }

}
