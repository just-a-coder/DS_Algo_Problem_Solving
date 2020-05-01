package com.problemsolving.leetcode.binarysearch.easy;

public class FirstBadVersion_278 {
    static int count = 0;

    public static int firstBadVersion(int n) {
        int low = 1, high = n, mid;
        while (low < high) {
            mid = low + (high - low)/2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }

    // For TestCase
    public static boolean isBadVersion(int version) {
        if (version == 1) {
            return false;
        }else if (version == 2) {
            return false;
        }else if (version == 3) {
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(3));
    }
}
