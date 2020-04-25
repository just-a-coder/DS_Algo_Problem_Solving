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
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        int low = 0, high = m * n - 1, pivotIdx, pivotElement;
        while (low <= high) {
            pivotIdx = low + (high - low) / 2;
            pivotElement = matrix[pivotIdx / n][pivotIdx % n];
            if (pivotElement == target) {
                return true;
            } else {
                if (pivotElement > target)
                    high = pivotIdx - 1;
                else
                    low = pivotIdx + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 4}, {2,5}};
        int k = 2;
        System.out.println(searchMatrix(arr, k));
    }
}
