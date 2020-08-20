package com.problemsolving.leetcode.array.easy;

public class MaxConsecutiveOne_485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, start = 0, end = 0;
        while(end < nums.length && start <= end){
            if(nums[end] == 1){
                max = Math.max(end - start+1, max);
            }else{
                start = end;
                start++;
            }
            end++;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
