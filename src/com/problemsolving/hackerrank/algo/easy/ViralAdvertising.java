package com.problemsolving.hackerrank.algo.easy;

public class ViralAdvertising {
    public static void main(String[] args) {
        int n = 3;
        int result = viralAdvertising(n);
        System.out.println(result);
    }

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int noOfLikes = 0;
        int receipent = 5;
        for (int i = 1; i <= n; i++) {
            noOfLikes = noOfLikes + receipent / 2;
            receipent = (receipent / 2) * 3;
        }
        return noOfLikes;
    }
}
