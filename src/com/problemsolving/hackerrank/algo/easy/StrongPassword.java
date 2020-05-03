package com.problemsolving.hackerrank.algo.easy;

public class StrongPassword {

    public static void main(String[] args) {
        String password = "Ab1";
        int minNoCharReq = minimumNumber(password.length(),password);
        System.out.println(minNoCharReq);
    }


    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        int minNoOfChar = 0;
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        int numCount = 0, lowerCaseCount = 0, upperCaseCount = 0, specialCharCount = 0;

        char arr[] = password.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (numbers.contains(password.subSequence(i,i+1))) {
                numCount++;
            } else if (lower_case.contains(password.subSequence(i,i+1))) {
                lowerCaseCount++;
            } else if (upper_case.contains(password.subSequence(i,i+1))) {
                upperCaseCount++;
            } else if (special_characters.contains(password.subSequence(i,i+1))) {
                specialCharCount++;
            }
        }

        if (numCount < 1) {
            minNoOfChar++;
        }
        if (lowerCaseCount < 1) {
            minNoOfChar++;
        }
        if (upperCaseCount < 1) {
            minNoOfChar++;
        }
        if (specialCharCount < 1) {
            minNoOfChar++;
        }

        int lengthCount = 0;
        if (password.length() + minNoOfChar < 6) {
            lengthCount = 6 - (password.length() + minNoOfChar);
        }

        return minNoOfChar+lengthCount;
    }
}