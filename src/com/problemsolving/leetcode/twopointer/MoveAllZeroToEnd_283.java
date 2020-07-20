package com.problemsolving.leetcode.twopointer;

import java.util.Arrays;

public class MoveAllZeroToEnd_283 {
    public static void moveZeroes(int[] nums) {
        int slow  = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums,i, slow);
                slow++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{2,0,1,0,0,4,0};
        moveZeroes(nums);
    }
}
