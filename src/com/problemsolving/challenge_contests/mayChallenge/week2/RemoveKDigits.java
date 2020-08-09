package com.problemsolving.challenge_contests.mayChallenge.week2;

import java.util.Stack;

/**
 * After observing the two examples we can say that if all the digits are in increasing order than
 * we will delete the last digit ,
 * otherwise we will delete a digit for which next digit is smaller.
 */
public class RemoveKDigits {
/*    public static String removeKdigits(String num, int k) {
        int len = num.length();
        String result = "";
        StringBuilder sb = new StringBuilder(num);

        for (int i = 1; i <= k; i++) {
            int j = 0;
            while (j < sb.length() - 1 && sb.charAt(j) <= sb.charAt(j + 1)) {
                j++;
            }
            sb.delete(j, j + 1);
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.delete(0,1);
        }

        if (sb.length() == 0) {
            return "0";
        }

        return result;
    }*/

    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (Character ch : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && ch < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        for (int i = 0; i < k; i++) {
            stack.pop();
        }

        boolean leadingZero = true;
        for (char digit : stack) {
            if(leadingZero && digit == '0') continue;
            leadingZero = false;
            res.append(digit);
        }

        return (res.length()>0)?res.toString():"0";
    }

    public static void main(String[] args) {
        //String num = "4435219";
        String num = "10200";
        int k = 1;
        System.out.println(removeKdigits(num, k));
    }
}
