package com.problemsolving.leetcode.array.easy;

public class SumOfDigitsInTheMinimumNumber_1085 {
    public int sumOfDigits(int[] A) {
        int result = 0, smallest = Integer.MAX_VALUE;
        for(int num: A){
            smallest = Math.min(smallest, num);
        }

        int sum = 0;
        while(smallest > 0){
            sum += smallest % 10;
            smallest /= 10;
        }

        if(sum % 2 == 1) return 0;
        else return 1;
    }
}
