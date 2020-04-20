package com.problemsolving.logicmojo.array;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Find minimum no of Jump Required to Reach the last index
 */


public class JumpGameProblem {
    public static void main(String[] args) {
        int arr[] = new int[]{3,4,2,1,4,1,1,1,1};
        int miniJump = minNumOfJumpLinear(arr);
        //int miniJump = minimumNumberOfJump(arr,0,arr.length-1);
        System.out.println(" Minimum No Of Jump Required : "+miniJump);
    }

    public static int minNumOfJumpLinear(int arr[]) {
        if (arr.length <= 1)
            return 0;

        int maxValue = arr[0];
        int step = arr[0];
        int jump = 1;

        for (int i = 1; i < arr.length; i++) {
            if(i == arr.length -1)
                return jump;

            maxValue = Math.max(maxValue, i + arr[i]);
            step--;

            if (step == 0) {
                jump++;
                step = maxValue -1;
            }
        }
        return jump;
    }

    // Recursion Approach
    public static int minimumNumberOfJump(int[] a, int start, int end){
        //If start == end, we reached the end, return 0.
        if(start == end) return 0;

        //if current element is 0, you cannot jump to end at all
        if(a[start] == 0) return Integer.MAX_VALUE;

        int minimumJumps = Integer.MAX_VALUE;

        for(int k=start+1; k<=start+a[start] && k<=end; k++){
            /*
            For each K from start+1 to end, find the minimum jumps.
             */
            int jumps = minimumNumberOfJump(a,k,end);
            if(jumps != Integer.MAX_VALUE && jumps + 1 < minimumJumps){
                minimumJumps  = jumps + 1;
            }
        }
        return minimumJumps;
    }
}
