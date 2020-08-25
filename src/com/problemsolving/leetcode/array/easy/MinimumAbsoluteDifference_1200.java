package com.problemsolving.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference_1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i + 1] - arr[i];
            if (min == smallest) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (min < smallest) {
                result = new ArrayList<>();
                result.add(Arrays.asList(arr[i], arr[i + 1]));
                smallest = min;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4,2,3,1};
        MinimumAbsoluteDifference_1200 ob = new MinimumAbsoluteDifference_1200();
        System.out.println(ob.minimumAbsDifference(arr));
    }
}
