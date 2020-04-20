package com.problemsolving.leetcode.binarysearch.medium;

/**
 * Input: weights = [3,2,2,4,1,4], D = 3
 * Output: 6
 * Explanation:
 * A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
 * 1st day: 3, 2
 * 2nd day: 2, 4
 * 3rd day: 1, 4
 */
public class CapacityToShipPackageWithinDDays_1011 {
    public static int shipWithinDays(int[] arr, int D) {
        int start = 0, end = 0, mid, res = 0;
        start = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            end += arr[i];
            start = Math.max(start, arr[i]);
        }
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (isValidWeight(arr, D, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    private static boolean isValidWeight(int arr[], int k, int maxw) {
        int sum = 0, count = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxw) {
                count++;
                sum = arr[i];
            }
            if (count > k) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 1, 1};
        int k = 4;
        System.out.println(shipWithinDays(arr, k));

    }
}
