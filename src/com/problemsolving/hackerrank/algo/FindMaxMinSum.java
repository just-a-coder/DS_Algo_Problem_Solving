package com.problemsolving.hackerrank.algo;

public class FindMaxMinSum {
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,5,7,9};
        findMaxMinSum(arr);
    }

    private static void findMaxMinSum(int[] arr) {
        long max = arr[0], min = arr[0], total =0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println((total-max)+" "+(total-min));
    }
}
