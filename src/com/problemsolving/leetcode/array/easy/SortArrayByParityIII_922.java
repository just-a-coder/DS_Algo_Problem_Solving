package com.problemsolving.leetcode.array.easy;

import java.util.Arrays;

public class SortArrayByParityIII_922 {
    public static int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for(int i = 0; i < A.length; i+= 2){
            if(A[i] % 2 != 0){
                for(; j < A.length; j+= 2){
                    if(A[j] % 2 == 0){
                        swap(A, i, j);
                        break;
                    }
                }
            }
        }
        return A;
    }

    private static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3,4};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }
}
