package com.problemsolving.hackerrank.algo.easy;

public class BeautifulDayAtMovies {
    public static void main(String[] args) {
        int i = 13, j = 45, k = 3;
        int beautifuldaysCount = beautifulDays(i, j, k);
        System.out.println(beautifuldaysCount);
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int dayscount = 0;
        for (int x = i; x <= j; x++) {
            int rev = rev(x);
            if ((rev - x) % k == 0) {
                dayscount++;
            }
        }
        return dayscount;
    }

    private static int rev(int x) {
        int rev = 0;
        while (x > 0) {
            int mod = x%10;
            rev = rev*10+mod;
            x = x/10;
        }
        return rev;
    }
}
