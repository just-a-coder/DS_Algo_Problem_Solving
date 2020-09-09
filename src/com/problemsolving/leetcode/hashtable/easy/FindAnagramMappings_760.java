package com.problemsolving.leetcode.hashtable.easy;

import java.util.*;

public class FindAnagramMappings_760 {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int result[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            map.computeIfAbsent(B[i], k -> new ArrayList<>()).add(i);
        }

        for (int i = 0; i < A.length; i++) {
            result[i] = map.get(A[i]).remove(map.get(A[i]).size() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        FindAnagramMappings_760 ob = new FindAnagramMappings_760();
        int A[] = new int[]{1,2,2,1,3};
        int B[] = new int[]{2,1,1,3,2};
        System.out.println(Arrays.asList(ob.anagramMappings(A, B)));
    }
}
