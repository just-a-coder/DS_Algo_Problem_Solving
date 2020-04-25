package com.problemsolving.leetcode.binarysearch.medium;

public class MinimumSizeSubArraySum_206 {
    public static int minSubArrayLen(int s, int[] nums) {
        int start = 0, minCount = Integer.MAX_VALUE, n = nums.length, sum =0;
        boolean flag = false;
        for(int i=0; i<n;i++){
            sum += nums[i];
            while(sum>=s){
                minCount = Math.min(minCount, i-start+1);
                sum -= nums[start++];
                flag = true;
            }
        }
        if(flag)
        return minCount;
        else return 0;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{};
        int s = 100;
        System.out.println(minSubArrayLen(s, arr));
    }
}
