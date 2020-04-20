package com.problemsolving.hackerrank.algo;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ElectronicShop {
    public static void main(String[] args) {
        int keyboards[] = new int[]{3, 1};
        int drives[] = new int[]{5, 2, 8};
        int budget = 10;
        int moneySpent = getMoneySpent(keyboards, drives, budget);
        System.out.println(moneySpent);

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int nearbysum = 0;
        for (int i = keyboards.length - 1; i >= 0; i--) {
            int high = drives.length - 1;
            int low = 0;
            while (low <= high) {
                int mid = (high + low) / 2;
                int sum = drives[mid] + keyboards[i];
                if (sum == b) {
                    return b;
                } else if (sum < b) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
                if (sum > nearbysum && sum <= b) {
                    nearbysum = sum;
                }
            }
        }
        if (nearbysum > 0)
            return nearbysum;
        else
            return -1;
    }
}
