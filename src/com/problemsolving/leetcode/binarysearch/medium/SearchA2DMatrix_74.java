package com.problemsolving.leetcode.binarysearch.medium;

/**
 * Input:
 * matrix = [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * target = 3
 * Output: true
 */
public class SearchA2DMatrix_74 {
    public static boolean searchMatrix(int[][] t, int k) {
        int m = t.length;
        if (m == 0) return false;
        int n = t[0].length;
        int i = 0, j = n - 1;
        while (i >= 0 && i < m && j >= 0 && j < n) {
            if (t[i][j] == k) {
                return true;
            } else if (t[i][j] > k) {
                j--;
            } else if (t[i][j] < k) {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[][]{};
        int k = 13;
        System.out.println(searchMatrix(arr, k));
    }
}
