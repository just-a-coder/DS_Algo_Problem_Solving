package com.problemsolving.leetcode.binarysearch.easy;

import java.util.*;
import java.util.stream.Collectors;

public class WeakestRow_1337 {
    public  static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        LinkedHashMap<Integer, Integer> lmap = new LinkedHashMap<>();
        int resarr[] = new int[k];
        int i = 0, j = 0;
        while (i >= 0 && i < m && j >= 0 && j < n) {
            if (mat[i][j] == 1) {
                if (j < n - 1) {
                    j++;
                } else {
                    lmap.put(i, j + 1);
                    i++;
                    j = 0;
                }
            } else if (mat[i][j] == 0) {
                lmap.put(i, j);
                i++;
                j = 0;
            }
        }

        lmap = lmap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1,e2)->e2,LinkedHashMap::new));

        int count =0;
        for (Integer key : lmap.keySet()) {
            resarr[count++] = key;
            if (count == k) {
                break;
            }
        }

        return resarr;
    }

    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int k = 2;
        System.out.println(Arrays.toString(kWeakestRows(arr, k)));
    }
}
