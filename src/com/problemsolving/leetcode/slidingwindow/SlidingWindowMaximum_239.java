package com.problemsolving.leetcode.slidingwindow;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class SlidingWindowMaximum_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length, max = Integer.MIN_VALUE, start = 0;
        Deque<Integer> numdq = new LinkedList<Integer>();
        int resarr[] = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            numdq.add(nums[i]);
            if (i - start + 1 == k) {
                Iterator iterator = numdq.iterator();
                while (iterator.hasNext())
                   max = Math.max(max, (Integer)iterator.next());

                resarr[start++] = max;
                numdq.remove();
                max = Integer.MIN_VALUE;
            }
        }
        return resarr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,-1};
        int k = 1;
        SlidingWindowMaximum_239 ob = new SlidingWindowMaximum_239();
        System.out.println(Arrays.toString(ob.maxSlidingWindow(arr, k)));
    }
}
