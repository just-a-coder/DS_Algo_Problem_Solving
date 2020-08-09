package com.problemsolving.challenge_contests.mayChallenge.week1;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        boolean result = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            arr[ransomNote.charAt(i)-'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            --arr[magazine.charAt(i)-'a'];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aabx", "acadb"));
    }
}
