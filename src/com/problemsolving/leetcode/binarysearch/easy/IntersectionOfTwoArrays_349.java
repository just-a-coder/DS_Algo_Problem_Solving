package com.problemsolving.leetcode.binarysearch.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hset = new HashSet<>();
        Arrays.stream(nums1).forEach(i -> hset.add(i));
        return Arrays.stream(nums2).filter(i->hset.remove(i)).toArray();
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2, 3, 4, 5};
        int arr2[] = new int[]{2, 3,6,8};
        int k = 2;
        int arr[] = intersection(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }
}
