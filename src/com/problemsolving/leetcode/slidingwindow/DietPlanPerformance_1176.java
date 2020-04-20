package com.problemsolving.leetcode.slidingwindow;

/**
 * #1176
 * Input: calories = [3,2], k = 2, lower = 0, upper = 1
 * Output: 1
 * Explanation: Since k = 2, we consider subarrays of length 2.
 * calories[0] + calories[1] > upper so 1 point is gained.
 */

public class DietPlanPerformance_1176{
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int res = 0, start = 0, wsum = 0;
        for (int i = 0; i < k; i++) {
            wsum += calories[i];
        }

        for (int i = k; i <= calories.length; i++,start++) {
            if (wsum < lower) {
                res--;
            } else if (wsum > upper) {
                res++;
            }
            if(i<calories.length)
            wsum += calories[i] - calories[start];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{6,5,0,0};
        DietPlanPerformance_1176 ob = new DietPlanPerformance_1176();
        int k = 2, lower = 1, upper = 5;
        System.out.println(ob.dietPlanPerformance(arr,k,lower,upper ));
    }
}
