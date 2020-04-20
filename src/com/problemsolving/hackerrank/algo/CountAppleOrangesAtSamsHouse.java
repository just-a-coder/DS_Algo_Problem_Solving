package com.problemsolving.hackerrank.algo;

public class CountAppleOrangesAtSamsHouse {
    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int[] apples = new int[]{-2,2,1};
        int[] oranges = new int[]{5,-6};

        countApplesAndOranges(s,t,a,b,apples,oranges);
    }


    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int actualAppleCount = 0, actualOrangeCount = 0;

        for (int i = 0; i < apples.length; i++) {
            apples[i] = apples[i] + a;
        }

        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = oranges[i] + b;
        }

        for (int i = 0; i < apples.length; i++) {
            if(apples[i]>=s && apples[i]<=t)
                actualAppleCount++;
        }

        for (int i = 0; i < oranges.length; i++) {
            if(oranges[i]>=s && oranges[i]<=t)
                actualOrangeCount++;
        }
        System.out.println(actualAppleCount);
        System.out.println(actualOrangeCount);
    }
}
