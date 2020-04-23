package com.problemsolving.leetcode.stack.easy;

import java.util.Stack;

/**
 * Input: ["5","2","C","D","+"]
 * Output: 30
 * Explanation:
 Integer (one round's score): Directly represents the number of points you get in this round.
 "+" (one round's score): Represents that the points you get in this round are the sum
 of the last two valid round's points.
 "D" (one round's score): Represents that the points you get in this round are the doubled
 data of the last valid round's points.
 "C" (an operation, which isn't a round's score): Represents the last valid round's points
 you get were invalid and should be removed.
 */
public class BaseballGame_682 {
    public static int calPoints(String[] ops) {
        int score  = 0;
        Stack<String> st = new Stack<>();
        for (int i = 0; i < ops.length; i++) {

            if (!st.isEmpty() && ops[i].equals("C")) {
                st.pop();
            } else if (!st.isEmpty() && ops[i].equals("D")) {
                int num = Integer.parseInt(st.peek());
                st.push(String.valueOf(num*2));
            } else if (!st.isEmpty() && ops[i].equals("+")) {
                int num1 = 0, num2 = 0;
                num1 = Integer.parseInt(st.pop());

                if (!st.isEmpty()) {
                    num2 = Integer.parseInt(st.pop());
                    st.push(String.valueOf(num2));
                }
                st.push(String.valueOf(num1));
                st.push(String.valueOf(num1 + num2));
            } else {
                st.push(ops[i]);
            }
        }
        while (!st.isEmpty()) {
            score += Integer.parseInt(st.pop());
        }
        return score;
    }

    public static void main(String[] args) {
        String arr[] = new String[]{"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(arr));
    }
}
