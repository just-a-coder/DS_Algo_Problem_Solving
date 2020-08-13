package com.problemsolving.leetcode.array.easy;

public class SortArrayByParity_905 {
    public int[] sortArrayByParity(int[] A) {
        int start = 0, end = A.length - 1;
        while(start < end) {
            while(A[start] % 2 != 1 && start < end){
                start++;
            }

            while(A[end] % 2 != 0 && start < end){
                end--;
            }

            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
        }

        return A;
    }
}
