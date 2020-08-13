package com.problemsolving.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlipAnImage_832 {
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            reverseArray(A[i]);
        }
        return A;
    }

    private static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = (arr[start] == 0) ? 1 : 0;
            arr[start] = (arr[end] == 0) ? 1 : 0;
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int result[][] = flipAndInvertImage(matrix);
        for (int inner[] : result) {
            for (int in : inner) {
                System.out.print(in+" ");
            }
            System.out.println();
        }
    }
}
