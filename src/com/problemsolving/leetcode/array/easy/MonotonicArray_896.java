package com.problemsolving.leetcode.array.easy;

public class MonotonicArray_896 {
    public boolean isMonotonic(int[] A) {
        boolean inc = false, dec = false;
        for(int i = 1; i < A.length; i++){
            if(A[i] > A[i-1]){
                inc = true;
            }

            if(A[i] < A[i-1]){
                dec = true;
            }

            if(inc && dec){
                return false;
            }
        }
        return (inc && dec)?false:true;
    }
}
