package com.problemsolving.leetcode.array.easy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindThirdMaximum_414 {
    public int thirdMax(int[] nums) {
        Set<Integer> maximums = new HashSet<Integer>();
        for (int num : nums) {
            maximums.add(num);
            if (maximums.size() > 3) {
                maximums.remove(Collections.min(maximums));
            }
        }
        if (maximums.size() == 3) {
            return Collections.min(maximums);
        }
        return Collections.max(maximums);
    }
}
