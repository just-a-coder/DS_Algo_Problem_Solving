package com.problemsolving.leetcode.binarysearch.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Input: mat = [[1,2,3,4,5],[2,4,5,8,10],[3,5,7,9,11],[1,3,5,7,9]] Output: 5
 */
public class FindSmallestCommonElementInAllRows_1198 {
    public static int smallestCommonElement(int[][] mat) {
        int m = mat.length;
        if (m == 0)
            return -1;
        int n = mat[0].length;
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int j = 0; j < n; j++) {
            boolean found = true;
            for (int i = 0; i < m && found; i++) {
                found = Arrays.binarySearch(mat[i], mat[0][j])>=0;
            }
            if (found)
                return mat[0][j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int mat[][] = new int[][]{{1, 2, 3, 4, 5}, {2, 4, 5, 8, 10}, {3, 5, 7, 9, 11}, {1, 3, 5, 7, 9}};
        System.out.println(smallestCommonElement(mat));
    }
}
