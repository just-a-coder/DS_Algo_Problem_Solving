package com.problemsolving.leetcode.slidingwindow;

/**
 * #1100
 * Input: S = "havefunonleetcode", K = 5
 * Output: 6
 * Explanation:
 * There are 6 substrings they are : 'havef','avefu','vefun','efuno','etcod','tcode'.
 */
public class KLengthSubstringNoRepeatedChar_1100 {
    public int numKLenSubstrNoRepeats(String str, int k) {
        int res = 0, opcount = 0, start = 0;
        boolean flag = false;
        int arr[] = new int[128];
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)]++ > 0) {
                flag = true;
            }

            while (flag) {
                if (--arr[str.charAt(start++)] > 0) {
                    flag = false;
                }
            }

            if (i - start + 1 == k) {
                opcount++;
                --arr[str.charAt(start++)];
            }
            res= Math.max(res, i-start+1);
        }
        return opcount;
    }

    public static void main(String[] args) {
        String str = "havefunonleetcode";
        int k = 5;
        KLengthSubstringNoRepeatedChar_1100 ob = new KLengthSubstringNoRepeatedChar_1100();
        System.out.println(ob.numKLenSubstrNoRepeats(str, k));
    }

}
