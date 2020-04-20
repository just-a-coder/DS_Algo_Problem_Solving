package com.problemsolving.leetcode.string;

public class NumberOfSubstrings_1358 {
    public int numberOfSubstrings(String s) {
        int tarr[] = new int[128];
        int sarr[] = new int[128];

        String t = "abc";
        int res = 0, start = 0;

        for (int i = 0; i < t.length(); i++) {
            tarr[t.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            sarr[s.charAt(i)]++;
            if (matches(sarr, tarr)) {
                res += 1 + (s.length() - i - 1);
                --sarr[s.charAt(start++)];
            }
        }
        return res;
    }

    private boolean matches(int[] sarr, int[] tarr) {
        for (int i = 0; i < tarr.length; i++) {
            if (tarr[i] > 0 && tarr[i] > sarr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        NumberOfSubstrings_1358 ob = new NumberOfSubstrings_1358();
        System.out.println(ob.numberOfSubstrings("aaacb"));
    }

}
