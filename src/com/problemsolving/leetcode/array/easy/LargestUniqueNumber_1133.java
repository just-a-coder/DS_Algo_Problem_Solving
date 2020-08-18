package com.problemsolving.leetcode.array.easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LargestUniqueNumber_1133 {

    // Using Map
/*    public static int largestUniqueNumber(int[] A) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i =0; i < A.length; i++){
            hmap.put(A[i], hmap.getOrDefault(A[i],0)+1);
        }

        int result = -1;
        for(int num : hmap.keySet()){
            if(num > result && hmap.get(num) == 1){
                result = num;
            }
        }
        return result;
    }*/

    // Using Array
    public static int largestUniqueNumber(int[] A) {
        int freq[] = new int[1001];
        for (int i : A) {
            freq[i]++;
        }

        for (int i = freq.length - 1; i >= 0; i--) {
            if(freq[i] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5, 7, 3, 9, 4, 9, 8, 3, 1};
        System.out.println(largestUniqueNumber(arr));
    }
}
