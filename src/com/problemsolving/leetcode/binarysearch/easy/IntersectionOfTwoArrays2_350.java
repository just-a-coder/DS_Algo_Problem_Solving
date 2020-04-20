package com.problemsolving.leetcode.binarysearch.easy;


import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays2_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            hmap.put(nums1[i], hmap.getOrDefault(nums1[i],0)+1);
        }

        for (int i = 0; i < nums2.length; i++) {
            hmap.put(nums2[i], hmap.getOrDefault(nums2[i],0)-1);
            if (hmap.get(nums2[i]) >= 0) {
                list.add(nums2[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,2,1};
        int arr2[] = new int[]{2,2};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
}
