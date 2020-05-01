package com.problemsolving.leetcode.binarysearch.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Input: colors = [1,1,2,1,3,2,2,3,3], queries = [[1,3],[2,2],[6,1]]
 * Output: [3,0,3]
 * Explanation:
 * The nearest 3 from index 1 is at index 4 (3 steps away).
 * The nearest 2 from index 2 is at index 2 itself (0 steps away).
 * The nearest 1 from index 6 is at index 3 (3 steps away).
 */
public class ShortestDistanceToTargetColor_1182 {
    public static List<Integer> shortestDistanceColor(int[] colors, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, List<Integer>> hmap = new HashMap<>();
        List<Integer> alist;
        for (int i = 0; i < colors.length; i++) {
            int num = colors[i];
            if (hmap.containsKey(num)) {
                alist = hmap.get(num);
            } else {
                alist = new ArrayList<>();
            }
            alist.add(i);
            hmap.put(num, alist);
        }
        for (int arr[] : queries) {
            int index = arr[0];
            int num = arr[1];
            List<Integer> numIndexlist = new ArrayList<>();
            if (hmap.containsKey(num)) {
                numIndexlist = hmap.get(num);
                int diff = findDiff(numIndexlist, index);
                result.add(diff);
            } else {
                result.add(-1);
            }
        }
        return result;
    }

    private static int findDiff(List<Integer> numIndexlist, int index) {
        int diff = -1;
        int low = 0, high = numIndexlist.size()-1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (numIndexlist.get(mid) == index) {
                return 0;
            } else if (numIndexlist.get(mid) < index) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (low < numIndexlist.size() && high >= 0) {
            diff = (Math.abs(numIndexlist.get(low) - index)) > (Math.abs(numIndexlist.get(high) - index)) ?
                    (Math.abs(numIndexlist.get(high) - index)) : (Math.abs(numIndexlist.get(low) - index));
        } else if (low < numIndexlist.size()) {
            diff = Math.abs(numIndexlist.get(low) - index);
        } else {
            diff = Math.abs(numIndexlist.get(high) - index);
        }

        return diff;
    }

    public static void main(String[] args) {
        int colors[] = new int[]{1,1,2,1,3,2,2,3,3};
        int queries[][] = new int[][]{{6,1}};
        shortestDistanceColor(colors, queries).forEach(i -> System.out.println(i));
    }
}
//[1,1,2,1,3,2,2,3,3]
//        [[1,3],[2,2],[6,1]]
