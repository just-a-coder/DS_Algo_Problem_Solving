package com.problemsolving.leetcode.binarysearch.easy;

/**
 * Forward declaration of guess API.
 *
 * @return -1 if num is lower than the guess number
 * 1 if num is higher than the guess number
 * otherwise return 0
 * int guess(int num);
 */
public class GuessNumberHigherOrLower {
    public static int guessNumber(int n) {
        int m = 1, mid ;
        while (m <= n) {
            mid = m + (n - m) / 2;
            int x = guess(mid);
            if (x == 0) {
                return mid;
            } else if (x < 0) {
                n = mid - 1;
            } else if (x > 0) {
                m = mid + 1;
            }
        }
        return -1;
    }

    public static int guess(int guessNum) {
        int num = 6;
        if (num < guessNum) {
            return -1;
        } else if (num > guessNum) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

}
