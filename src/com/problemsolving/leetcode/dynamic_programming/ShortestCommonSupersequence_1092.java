package com.problemsolving.leetcode.dynamic_programming;

public class ShortestCommonSupersequence_1092 {
    public static String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[m+1][n+1];

        StringBuffer result = new StringBuffer();
        int i =0, j = 0;
        for(;i<m; i++){
            for(;j<n; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }else{
                    if(str1.charAt(i-1) == str2.charAt(j-1)){
                        dp[i][j] = 1 + dp[i-1][j-1];
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }

        System.out.println("i:"+i+" j:"+j);
        while(i>0 && j>0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                result.insert(0,str1.charAt(i-1));
                i--;
                j--;
            }else{
                if(str1.charAt(i-1)>str2.charAt(j-1)){
                    result.insert(0,str1.charAt(i-1));
                    i--;
                }else{
                    result.insert(0,str2.charAt(j-1));
                    j--;
                }
            }
        }

        while(i>0){
            result.insert(0,str1.charAt(i-1));
            i--;
        }

        while(j>0){
            result.insert(0,str2.charAt(j-1));
            j--;
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String text1 = "abac";
        String text2 = "cab";
        System.out.println(shortestCommonSupersequence(text1, text2));
    }
}
