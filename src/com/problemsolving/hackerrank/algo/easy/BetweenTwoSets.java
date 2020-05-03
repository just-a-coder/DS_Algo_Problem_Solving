package com.problemsolving.hackerrank.algo.easy;

public class BetweenTwoSets {

    public static void main(String[] args) {
        int arr[] = new int[]{3,4};
        int brr[] = new int[]{24, 48};
        int result = getTotalX(arr, brr);
        System.out.println(result);
    }

    public static int getTotalX(int arr[], int brr[]) {
        int f = lcm(arr);
        int l = gcd(brr);
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;}
        }
        return count;
    }


    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static int gcd(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }
}
