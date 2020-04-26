package com.problemsolving.leetcode.string;

public class MaximumScoreAfterSplittingAString_1422 {

    public int maxScore(String s) {
        int zc = 0, oc = 0, max=0, n = s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '1')
            oc++;
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                zc++;
            } else {
                oc--;
            }
            max = Math.max(max,zc+oc);
        }
        return max;
    }


    public static void main(String[] args) {
        String s = "1011101";
        MaximumScoreAfterSplittingAString_1422 ob = new MaximumScoreAfterSplittingAString_1422();
        System.out.println(ob.maxScore(s));
    }
}
