package com.problemsolving.leetcode.challenge_contests.contests;

import java.util.*;

public class Contest_Biweekly {
    public static int maxDiff(int num) {
        String numStr = Integer.toString(num);
        char arr[] = numStr.toCharArray();

        int freq = Character.getNumericValue(arr[0]);
        StringBuilder sb = new StringBuilder();

        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            int arNum = Character.getNumericValue(arr[i]);
            if (flag && arNum != 9) {
                freq = Character.getNumericValue(arr[i]);
                sb.append(9);
                flag = false;
            } else {
                if (arNum == 9 || arNum == freq) {
                    sb.append(9);
                }else {
                    sb.append(arr[i]);
                }
            }
        }
        int a = Integer.parseInt(sb.toString());

        flag = true;
        freq = Character.getNumericValue(arr[0]);
        char narr[] = numStr.toCharArray();
        StringBuilder nsb = new StringBuilder();
        int appendValue = 0;
        for (int i = 0; i < narr.length; i++) {
            int arNum = Character.getNumericValue(narr[i]);
            if (flag && arNum != 1) {
                freq = Character.getNumericValue(narr[i]);
                if (i == 0) {
                    nsb.append(1);
                    appendValue = 1;
                } else{
                    nsb.append(0);
                    appendValue = 0;
                }
                flag = false;

            } else {
                if (arNum == 1 || arNum == freq) {
                    if (i == 0) {
                        nsb.append(1);
                    } else {
                        nsb.append(appendValue);
                    }

                }else {
                    nsb.append(arr[i]);
                }

            }
        }
        int b = Integer.parseInt(nsb.toString());
        return a-b;
    }

    public static void main(String[] args) {
        int num = 1919;
        System.out.println(maxDiff(num));
    }
}