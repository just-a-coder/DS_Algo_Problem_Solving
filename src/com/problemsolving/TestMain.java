package com.problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {
    static String result = "";
    public static void main(String[] args) {
        String out = "";
        countStrings(3, out, 0);
        System.out.println(result);
    }



    public static void countStrings(int n, String out, int last_digit)
    {
        // if number becomes N-digit, print it
        if (n == 0)
        {
           // System.out.println(out);
            result = out;
            return;
        }

        // append 0 to the result and recur with one less digit
        countStrings(n - 1, out + '0', 0);

        // append 1 to the result and recur with one less digit
        // only if last digit is 0
        if (last_digit == 0) {
            countStrings(n - 1, out + '1', 1);
        }
    }

}


