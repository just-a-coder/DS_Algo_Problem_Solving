package com.problemsolving.trial;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, -2, 2};
        System.out.println(findMaxSumArray(arr));
        System.out.println(findCountOfMaxSumArray(arr));
    }

    /**
     * Kadanes Algorithm
     * Find Sum Of SubArray whose sum is maximum
     */
    private static int findMaxSumArray(int[] arr) {
        int lowsum = 0, maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            lowsum = Math.max(arr[i], lowsum + arr[i]);
            maxsum = Math.max(lowsum, maxsum);
        }
        return maxsum;
    }

    /**
     * Find Count of Index for Sum Of SubArray whose sum is maximum
     */
    private static int findCountOfMaxSumArray(int[] arr) {
        int lowsum =0, maxsum = Integer.MIN_VALUE, start = 0, end= 0, s=0;
        for (int i = 0; i < arr.length; i++) {
            lowsum +=arr[i];
            if (lowsum >= maxsum) {
                maxsum = lowsum;
                start = s;
                end = i;
            }

            if (lowsum < 0) {
                lowsum = 0;
                s = i+1;
            }
        }
        return end-start+1;
    }
}
