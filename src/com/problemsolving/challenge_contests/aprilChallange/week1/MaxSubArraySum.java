package com.problemsolving.challenge_contests.aprilChallange.week1;

/**
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaxSubArraySum {
    public static int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE, currsum = 0;
        for (int i = 0; i < nums.length; i++) {
            currsum = Math.max(nums[i], currsum+nums[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
