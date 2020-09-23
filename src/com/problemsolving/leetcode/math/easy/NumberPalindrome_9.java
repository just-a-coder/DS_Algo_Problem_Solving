package com.problemsolving.leetcode.math.easy;

public class NumberPalindrome_9 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int y = x;
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;
            rev = 10 * rev + rem;
        }
        return rev == y;
    }

    public static void main(String[] args) {
        NumberPalindrome_9 ob = new NumberPalindrome_9();
        System.out.println(ob.isPalindrome(-121));
    }
}
