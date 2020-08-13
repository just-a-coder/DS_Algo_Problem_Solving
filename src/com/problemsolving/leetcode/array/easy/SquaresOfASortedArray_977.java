package com.problemsolving.leetcode.array.easy;

public class SquaresOfASortedArray_977 {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int result[] = new int[len];
        int curr = len -1, tail = len - 1, head = 0;
        while(head < tail){
            if(A[head] * A[head] > A[tail] * A[tail]){
                result[curr--] = A[head] * A[head] ;
                head ++;
            }else{
                result[curr--] = A[tail] * A[tail] ;
                tail--;
            }
        }
        result[curr] = A[head] * A[head];
        return result;
    }
}
