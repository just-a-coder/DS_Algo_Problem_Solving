package com.problemsolving.leetcode.slidingwindow;

import java.util.Map;
import java.util.TreeMap;

public class LongestContSubArrayWithDiffLessOrEqualsK {
    public static int longestSubarray(int[] nums, int limit) {
        int slow = 0, max = 0;
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            tmap.put(num, tmap.getOrDefault(num,0)+1);
            while (tmap.lastKey() - tmap.firstKey() > limit) {
                int slownum = nums[slow];
                int freq = tmap.get(slownum);
                if (freq == 1) {
                    tmap.remove(slownum);
                } else {
                    tmap.put(slownum,tmap.get(slownum)-1);
                }
                slow++;
            }
            max = Math.max(max, i-slow+1);
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{4,2,2,2,4,2};
        int k = 0;
        System.out.println(longestSubarray(nums, k));
    }
}
