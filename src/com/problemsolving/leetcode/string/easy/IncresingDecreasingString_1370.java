package com.problemsolving.leetcode.string.easy;

public class IncresingDecreasingString_1370 {
    public static String sortString(String s) {
        int arr[] = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int count = s.length();
        while (count > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    sb.append((char) (i + 'a'));
                    arr[i]--;
                    count--;
                }
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] > 0) {
                    sb.append((char) (i + 'a'));
                    arr[i]--;
                    count--;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        System.out.println(sortString(s));
    }
}
