package com.problemsolving.hackerrank.algo;

public class KangarooJumpProblem {
    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;

        String response = kangaroo(x1, v1, x2, v2);
        System.out.println(response);
    }

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int firstCount = 0, secondCount = 0;
        if (v1 > v2) {
            int i = 1;
            firstCount = x1 + v1 * i;
            secondCount = x2 + v2 * i;
            while (firstCount < secondCount) {
                i++;
                firstCount = x1 + v1 * i;
                secondCount = x2 + v2 * i;
            }
        } else if (v1 < v2) {
            int i = 1;
            firstCount = x1 + v1 * i;
            secondCount = x2 + v2 * i;
            while (firstCount > secondCount) {
                i++;
                firstCount = x1 + v1 * i;
                secondCount = x2 + v2 * i;
            }
        }else{
            if (x1 == x2) {
                return "YES";
            } else {
                return "NO";
            }
        }

        if(firstCount == secondCount)
            return "YES";
        else
            return "NO";

    }

}
