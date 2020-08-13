package com.problemsolving.leetcode.array.easy;

import java.util.HashSet;
import java.util.Set;

public class CellsWithOddValueInMatrix_1252 {
    public static int oddCells(int n, int m, int[][] indices) {
        int row[] = new int[n];
        int column[] = new int[m];
        int result = 0;
        for (int inner[] : indices) {
            row[inner[0]]++;
            column[inner[1]]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((row[i] + column[j]) % 2 != 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int matrix[][] = new int[][]{{1,1},{0,0}};
        System.out.println(oddCells(n, m, matrix));
    }
}
