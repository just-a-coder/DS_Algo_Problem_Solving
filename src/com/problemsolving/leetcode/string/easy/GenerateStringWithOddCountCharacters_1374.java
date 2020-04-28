package com.problemsolving.leetcode.string.easy;

public class GenerateStringWithOddCountCharacters_1374 {
    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        int i;
        if (n % 2 == 0) {
            sb.append("b");
        } else {
            sb.append("a");
        }
        for (i = 1; i < n ; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n =3;
        System.out.println(generateTheString(n));
    }
}
