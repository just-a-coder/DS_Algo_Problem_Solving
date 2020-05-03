package com.problemsolving.leetcode.challenge_contests.contests;

import java.util.*;

public class Contest_Weekly {

    public static int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        int start = 0, i = 0, n = nums.length, count = 0;
        int k = 0;
        while (i < n) {
            if (tmap.containsKey(nums[i])) {
                k++;
            } else {
                tmap.put(nums[i], i);
                k = 0;
            }
            int last = tmap.lastKey();
            int first = tmap.firstKey();
            if (last - first <= limit) {
                i++;
            } else {
                int startValue = nums[start];
                tmap.remove(startValue);
                start++;
                i++;
            }
            if(k>0)
            count = Math.max(count, tmap.size()+k);
            else
                count = Math.max(count, tmap.size());
        }
        return count;
    }




    public static void main(String[] args) {
        int k =8;
        int arr[] = new int []{8,7,4,2,8,1,7,7};
        System.out.println(longestSubarray(arr, k));
    }
}
