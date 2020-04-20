package com.problemsolving.leetcode.string;

public class PermutationOfString_567 {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "dabc";
        PermutationOfString_567 ob = new PermutationOfString_567();
        System.out.println(ob.checkInclusion(s1,s2));
    }
    public boolean checkInclusion(String s1, String s2) {
        int arr1[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i)-'a']++;
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int arr2[] = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                arr2[s2.charAt(i+j)-'a']++;
            }
            if (matches(arr1,arr2)) {
                return true;
            }
        }
        return false;
    }

    public boolean matches(int arr1[], int arr2[]) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
