package com.problemsolving.leetcode.binarysearch.easy;

public class CountNegativeNumberInSortedMatrix_1351 {
    public static int countNegatives(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int count = 0;
        int i = 0, j = 0;
        while (i >= 0 && i < m && j >= 0 && j < n) {
            if (arr[i][j] >= 0 && j + 1 < n && arr[i][j + 1] < 0) {
                count += n - j - 1;
                i++;
            } else if (arr[i][j] >= 0 && j + 1 < n) {
                j++;
            } else if (arr[i][j] >= 0 && j + 1 == n){
                i++;
            } else if (arr[i][j] < 0 && j == 0) {
                count += n;
                i++;
            } else if (arr[i][j] < 0 && (j - 1) >= 0) {
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = new int[][]{{4,3,-1,-1},{3,2,-1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(arr));
    }
}
