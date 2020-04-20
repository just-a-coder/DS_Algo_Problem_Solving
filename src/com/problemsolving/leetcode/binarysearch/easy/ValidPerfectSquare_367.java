package com.problemsolving.leetcode.binarysearch.easy;

public class ValidPerfectSquare_367 {
    public static boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long start = 1, end = num/2, mid;
        while (start <= end) {
            mid = start + (end-start)/2;
            long pow = mid * mid;
            if (pow == num) {
                return true;
            } else if (pow > num) {
                end = mid-1;
            } else if (pow < num) {
                start = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(isPerfectSquare(num));
    }
}
