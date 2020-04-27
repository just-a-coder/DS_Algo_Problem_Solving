package com.problemsolving.leetcode.string.easy;

/**
 * Input: keyboard = "pqrstuvwxyzabcdefghijklmno", word = "leetcode"
 * Output: 73
 */
public class SingleRowKeyBoard_1165 {
    public static int calculateTime(String keyboard, String word) {
        int arr[] = new int[26];
        for (int i = 0; i < keyboard.length(); i++) {
            arr[keyboard.charAt(i) - 'a'] = i;
        }
        int totalsum = 0, start = 0;
        for (int i = 0; i < word.length(); i++) {
            int var = arr[word.charAt(i) - 'a'];
            totalsum += Math.abs(var - start);
            start = var;
        }
        return totalsum;
    }

    public static void main(String[] args) {
        String s = "pqrstuvwxyzabcdefghijklmno";
        String word = "leetcode";
        System.out.println(calculateTime(s, word));
    }
}
