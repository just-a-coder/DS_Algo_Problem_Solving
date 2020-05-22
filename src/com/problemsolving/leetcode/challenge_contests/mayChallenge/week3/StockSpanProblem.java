package com.problemsolving.leetcode.challenge_contests.mayChallenge.week3;

import java.util.Deque;
import java.util.LinkedList;

public class StockSpanProblem {
    Deque<int[]> stack;
    public StockSpanProblem() {
        stack = new LinkedList<>();
    }

    public int next(int price) {
        int res = 1;
        while (!stack.isEmpty() && price >= stack.peek()[0]) {
            res += stack.pop()[1];
        }
        stack.push(new int[]{price,res});
        return res;
    }

    public static void main(String[] args) {
        StockSpanProblem obj = new StockSpanProblem();
        int param_1 = obj.next(100);
        int param_2 = obj.next(80);
        int param_3 = obj.next(60);
        int param_4 = obj.next(70);
        int param_5 = obj.next(60);
        int param_6 = obj.next(75);
        int param_7 = obj.next(85);
        System.out.println("["+param_1+","+param_2+","+param_3+","+param_4+","+param_5+","+param_6+","+param_7+"]");
    }
}
