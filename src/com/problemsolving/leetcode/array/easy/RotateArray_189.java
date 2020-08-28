package com.problemsolving.leetcode.array.easy;

import java.util.Arrays;

public class RotateArray_189 {
    public static void rotate(int[] nums, int k) {
        int temp = 0;
        while(k > 0){
            temp = nums[nums.length -1];
            for(int i = nums.length-1; i > 0 ; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            k--;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int k = 3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
