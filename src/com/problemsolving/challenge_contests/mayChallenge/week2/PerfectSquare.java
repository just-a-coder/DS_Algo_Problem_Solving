package com.problemsolving.challenge_contests.mayChallenge.week2;

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

    public static void main(String[] args) {
        int num = 808201;
        System.out.println(isPerfectSquare(num));
    }
}
