package com.problemsolving.leetcode.array.easy;

public class TransposeOfAMatrix_867 {
    public int[][] transpose(int[][] A) {
        int row = A.length, column = A[0].length;
        int matrix[][] = new int[column][row];

        for(int r = 0; r < row; r++){
            for(int c = 0; c < column; c++){
                matrix[c][r] = A[r][c];
            }
        }
        return matrix;
    }
}
