package com.problemsolving.leetcode.array.easy;

public class ReplaceElementWithGreatesElementOnRight_1299 {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int greatest = arr[len -1];
        arr[len -1] = -1;
        for(int i = len - 2;  i >= 0; i--){
            int temp = Math.max(greatest, arr[i]);
            arr[i] = greatest;
            greatest = temp;
        }
        return arr;
    }
}
