package com.problemsolving.hackerrank.algo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCase {
    public static void main(String[] args) {
        String s  = "oneTwoThree";
        int numberOfWords = camelcase(s);
        System.out.println(numberOfWords);
    }

    // Complete the camelcase function below.
    static int camelcase(String s) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find())
            count++;

        return ++count;
    }
}
