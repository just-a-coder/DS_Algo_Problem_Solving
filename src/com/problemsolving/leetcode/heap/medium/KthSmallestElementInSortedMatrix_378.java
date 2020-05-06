package com.problemsolving.leetcode.heap.medium;

/**
 * matrix = [
 *    [ 1,  5,  9],
 *    [10, 11, 13],
 *    [12, 13, 15]
 * ],
 * k = 8,
 * return 13.
 */

public class KthSmallestElementInSortedMatrix_378 {
    public static int kthSmallest(int[][] matrix, int k) {
        return 1;
    }

    public static void main(String[] args) {
        int mat[][] = new int[][]{{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        System.out.println(kthSmallest(mat, k));
    }
}
