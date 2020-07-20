package com.problemsolving.leetcode.challenge_contests.contests;

import java.util.*;

public class Contest_Biweekly {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int result = 0, sum = 0;
        sum = numBottles;
        result = sum;
        while (sum >= numExchange) {
            int rem = sum % numExchange;
            sum = sum / numExchange;
            result += sum;
            sum += rem;
        }
        return result;
    }

    public static void main(String[] args) {
        int numBottles = 15;
        int numExchange = 4;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }
}
