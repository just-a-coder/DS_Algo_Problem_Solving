package com.problemsolving.challenge_contests.contests;

import java.util.Stack;

public class Contest_Weekly_1 {

    public static char findKthBit(int n, int k) {
        String temp = "";
        String strry[] = new String[21];
        strry[0] = "0";
        strry[1] = "011";
        strry[2] = "0111001";
        strry[3] = "011100110110001";
        strry[4] = "0111001101100011011100100110001";
        for (int i = 5; i <= n; i++) {
            String tmp = strry[i-1].replace("1","2");
            tmp = tmp.replace("0","1");
            tmp = tmp.replace("2","0");
            StringBuilder sb=new StringBuilder(tmp);
            sb.reverse();
            temp = strry[i-1] + "1" + sb.toString();
            strry[i] = temp;
        }
        return strry[n].charAt(k-1);
    }


    public static void main(String[] args) {
       int n = 3, k = 1;
        System.out.println(findKthBit(n,k));
    }
}
