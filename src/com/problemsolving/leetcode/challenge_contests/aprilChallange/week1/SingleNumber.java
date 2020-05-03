package com.problemsolving.leetcode.challenge_contests.aprilChallange.week1;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Input: [4,1,2,1,2]
 * Output: 4
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
           res = res ^ nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
