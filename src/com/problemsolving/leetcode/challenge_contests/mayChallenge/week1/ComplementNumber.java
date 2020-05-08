package com.problemsolving.leetcode.challenge_contests.mayChallenge.week1;

public class ComplementNumber {
    public static int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        if(num == 0) return 1;
        while (num > 0) {
            int mod = num % 2;
            num = num /2;
            sb.insert(0,mod);
        }

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');
            } else {
                sb.setCharAt(i,'0');
            }
        }

        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            sum += Character.getNumericValue(sb.charAt(i)) * Math.pow(2,(sb.length()-1-i));
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 0;
        System.out.println(findComplement(num));
    }
}
