package com.problemsolving.leetcode.dynamic_programming;

public class CountSquareMatricesWithAllOne_1277 {
    public static int countSquares(int[][] matrix) {
        int res = 0;
        int rowlen = matrix.length;
        int columnlen = matrix[0].length;
        for(int i = 0; i< rowlen; i++){
            for(int j = 0; j<columnlen; j++){
                if(matrix[i][j] == 1 && i> 0 && j>0){
                    matrix[i][j] = 1 + Math.min(Math.min(matrix[i-1][j], matrix[i][j-1]), matrix[i-1][j-1]);
                }
                res += matrix[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1,0,1},{1,1,0},{1,1,0}};
        System.out.println(countSquares(matrix));
    }
}
