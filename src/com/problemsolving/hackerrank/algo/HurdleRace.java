package com.problemsolving.hackerrank.algo;

public class HurdleRace {
    public static void main(String[] args) {
        int height[] = new int[]{2, 5, 4, 5, 2};
        int k = 6;
        int result = hurdleRace(k, height);
        System.out.println(result);

    }

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        int maxheight = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > maxheight) {
                maxheight = height[i];
            }
        }
        if (maxheight > k) {
            return maxheight - k;
        } else {
            return 0;
        }
    }
}
