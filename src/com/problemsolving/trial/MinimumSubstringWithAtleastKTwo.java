package com.problemsolving.trial;

/**
 * Find Shortest Length Sequence  With Atleast Two 2s
 */

public class MinimumSubstringWithAtleastKTwo {
    public int findNumberWithAtleast(int arr[], int k) {
        int freqOfTwo = 0, start = 0, res = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                freqOfTwo++;
            }

            while (freqOfTwo == k) {
                res = Math.min(i-start+1, res);
                if (arr[start++] == 2) {
                    freqOfTwo--;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,1,2,1,2,1};
        MinimumSubstringWithAtleastKTwo ob = new MinimumSubstringWithAtleastKTwo();
        System.out.println(ob.findNumberWithAtleast(arr, 2));
    }
}
