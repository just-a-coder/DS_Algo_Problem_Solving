package com.problemsolving.leetcode.twopointer;

public class BinarySubArrayWithSum {
    public static int numSubarraysWithSum(int[] A, int S) {
        int result = 0, start = 0, sum = 0, i = 0;
        int n = A.length;
        if (S == 0) {
            result = (n * (n + 1)) / 2;
            return result;
        }

        while (i < n) {
            if (sum < S) {
                sum += A[i];
            }

            if (sum == S) {
                while (i < n - 1 && A[i + 1] == 0) {
                    i++;
                    result++;
                }
                while (A[start] == 0 && start < n) {
                    start++;
                    result++;
                }
            }
            if (sum > S) {
                sum -= A[start++];
            }else if(sum<S){
                i++;
            }
        }
        return result;
}

    public static void main(String[] args) {
        int arr[] = new int[]{1, 0, 1, 0, 1};
        int k = 2;
        System.out.println(numSubarraysWithSum(arr, k));
    }
}
