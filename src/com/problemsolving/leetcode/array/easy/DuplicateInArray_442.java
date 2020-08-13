package com.problemsolving.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateInArray_442 {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            nums[Math.abs(num) - 1] *= -1;
        }

        for (int num : nums) {
            if (nums[Math.abs(num) - 1] > 0) {
                result.add(Math.abs(num));
                nums[Math.abs(num) - 1] *= -1;
            }
        }


        // Tricky Shortcut
/*        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) {
                result.add(Math.abs(num));
            }
            nums[Math.abs(num) - 1] *= -1;
        }*/


        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{
                2, 3, 4, 2, 1
        };
        System.out.println(Arrays.asList(findDuplicates(arr)));
    }
}
