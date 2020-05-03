package com.problemsolving.hackerrank.algo.easy;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{2, 2, 1, 3, 2};
        List<Integer> alist = Arrays.asList(arr);
        int d = 4, m = 2;
        int noOfWays = birthday(alist, d, m);
        System.out.println(noOfWays);
    }


    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int noOfWays = 0;
        int n = s.size();
        for (int i = 0; i < n; i++) {
            int mcount = m;
            int sum = 0;
            int j = i;
            while (mcount >= 0 && j<n) {
                mcount--;
                sum = sum + s.get(j);

                if(sum > d) break;
                else if (sum == d && mcount == 0) {
                    noOfWays++;
                    break;
                }
                j++;
            }
        }
        return noOfWays;
    }
}
