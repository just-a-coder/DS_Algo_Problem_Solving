package com.problemsolving.leetcode.binarysearch.medium;

/**
 * Input: [3,4,5,1,2]
 * Output: 1
 */
public class FindMinimumInARotatedSortedArray {
    public static int findMin(int[] arr) {
        int start = 0, n = arr.length, end = n - 1, mid;
        if (n == 1) {
            return arr[0];
        }
        while (start <= end) {
            mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return arr[mid];
            }
            if (arr[mid] >= arr[next]) {
                return arr[next];
            }

            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
}
