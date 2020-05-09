package com.problemsolving.leetcode.challenge_contests.mayChallenge.week2;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long low = 1, high = num/2, mid;
        while(low<high){
            mid = low + (high - low)/2;
            long pow = mid * mid;
            if(pow >= num){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        if(low*low == num)
            return true;
        else
            return false;
    }

/*    public static boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long start = 1, end = num/2, mid;
        while (start <= end) {
            mid = start + (end-start)/2;
            long pow = mid * mid;
            if (pow == num) {
                return true;
            } else if (pow > num) {
                end = mid-1;
            } else if (pow < num) {
                start = mid+1;
            }
        }
        return false;
    }*/

    public static void main(String[] args) {
        int num = 808201;
        System.out.println(isPerfectSquare(num));
    }
}
