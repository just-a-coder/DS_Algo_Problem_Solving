package com.problemsolving.leetcode.array.medium;

public class MinimumNumberOfTargetCalls_1558 {
    int maxOneOp = 0;
    public int minOperations(int[] nums) {
        int result = 0;
        for(int in: nums){
            result += findZeroCount(in);
        }
        return result+maxOneOp;
    }

    private int findZeroCount(int num) {
        int count  = 0, oneOp= 0;
        while(num > 0){
            count += num % 2;
            num /= 2;
            if(num > 0) oneOp++;
        }
        maxOneOp = Math.max(oneOp,maxOneOp);
        return count;
    }

    public static void main(String[] args) {
        // int arr[] = new int[]{4,2,5};
        int arr[] = new int[]{123456789,987654321};
        MinimumNumberOfTargetCalls_1558 contest_set1 = new MinimumNumberOfTargetCalls_1558();
        System.out.println(contest_set1.minOperations(arr));
    }
}
