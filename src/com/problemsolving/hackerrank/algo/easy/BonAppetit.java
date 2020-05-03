package com.problemsolving.hackerrank.algo.easy;

import java.util.Arrays;
import java.util.List;

public class BonAppetit {

    public static void main(String[] args) {
        Integer arr[] = new Integer[]{3, 10, 2, 9};
        List<Integer> bill = Arrays.asList(arr);
        int k  = 1;
        int b = 12;
        bonAppetit(bill, k, b);

    }

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int actualAmount = 0, paidAmount = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                actualAmount = actualAmount + bill.get(i);
            }
        }
        actualAmount = actualAmount / 2;
        if (actualAmount == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actualAmount);
        }
    }
}
