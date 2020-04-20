package com.problemsolving.leetcode.binarysearch.easy;

public class SquareRoot_69 {
    public static int mySqrt(int x) {
        long start = 1, end = 2, mid;
        int res = 0;
        boolean flag = false;
        while (Math.pow(end, 2) < x) {
            start = end;
            end = 2 * end;
        }

        while (start <= end) {
            mid = (start + (end - start) / 2);
            long pow = (int) mid * mid;
            if (pow == x) {
                res = (int) mid;
                end = mid - 1;
                flag = true;
            } else if (pow > x) {
                end = mid - 1;
            } else if (pow < x) {
                start = mid + 1;
            }
        }

        if (flag) {
            return res;
        } else {
            return (int) end;
        }
    }


    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(mySqrt(num));
    }
}
