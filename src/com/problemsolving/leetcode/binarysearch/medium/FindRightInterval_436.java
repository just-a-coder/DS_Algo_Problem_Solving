package com.problemsolving.leetcode.binarysearch.medium;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Input: [ [3,4], [2,3], [1,2] ]
 * Output: [-1, 0, 1]
 * Explanation: There is no satisfied "right" interval for [3,4].
 * For [2,3], the interval [3,4] has minimum-"right" start point;
 * For [1,2], the interval [2,3] has minimum-"right" start point.
 */
public class FindRightInterval_436 {
    public static int[] findRightInterval(int[][] arr) {
        int m = arr.length;
        if(m==0) return null;
        int result[] = new int[m];
        TreeMap<Integer,Integer> startmap = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            startmap.put(arr[i][0],i);
        }

        for (int i = 0; i < m; i++) {
            Map.Entry<Integer,Integer> keyValue = startmap.ceilingEntry(arr[i][1]);
            result[i] = (keyValue==null)?-1:keyValue.getValue();
        }
        return result;
    }


    public static void main(String[] args) {
        int arr[][] = new int[][]{{3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(arr)));
    }
}
