package com.problemsolving.leetcode.binarysearch.medium;

/**
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * Given target = 5, return true.
 * <p>
 * Given target = 20, return false.
 */
public class SearchA2DMatrix2_240 {
        public static boolean searchMatrix(int[][] arr, int k) {
            int m = arr.length;
            if (m == 0) return false;
            int n = arr[0].length;
            int i = 0, j = n - 1;
            while (i >= 0 && i < m && j >= 0 && j < n) {
                if (arr[i][j] == k) return true;
                else if (arr[i][j] > k) j--;
                else i++;
            }
            return false;
        }

    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 1}};
        int k = 2;
        System.out.println(searchMatrix(arr, k));
    }
}
