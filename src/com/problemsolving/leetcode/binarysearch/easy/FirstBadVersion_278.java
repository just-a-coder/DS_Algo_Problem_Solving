package com.problemsolving.leetcode.binarysearch.easy;

public class FirstBadVersion_278 {
    static int count = 0;

    public static int firstBadVersion(int n) {
        int m = 1, mid, res = 0;
        while (m <= n) {
            mid = m + (n - m) / 2;
            if (isBadVersion(mid)) {
                res = mid;
                n = mid - 1;
            } else {
                m = mid + 1;
            }
        }
        return res;
    }

    // For TestCase
    public static boolean isBadVersion(int version) {
/*        if (version == 1) {
            return false;
        }else if (version == 2) {
            return false;
        }else if (version == 3) {
            return true;
        }*/
        return true;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(3));
    }
}
