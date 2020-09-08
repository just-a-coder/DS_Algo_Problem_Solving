package com.problemsolving.leetcode.array.easy;

public class MatrixDiagonalSUm_1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, res = 0;
        for (int i = 0; i < n; i++) {
            res += mat[i][i];
            if (i != n - 1 - i) res += mat[i][n - 1 - i];
        }
        return res;
    }
}
