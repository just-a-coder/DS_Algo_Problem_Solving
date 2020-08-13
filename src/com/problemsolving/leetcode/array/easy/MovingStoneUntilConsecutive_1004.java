package com.problemsolving.leetcode.array.easy;

import java.util.Arrays;

public class MovingStoneUntilConsecutive_1004 {
    public int[] numMovesStones(int a, int b, int c) {
        int min = 0, max = 0;
        int resarr[] = new int[2];

        max = Math.max(a, Math.max(b, c));
        min = Math.min(a, Math.min(b, c));
        int mid = (max == a) ? ((min == b) ? c : b) : ((min == a) ? (max == b ? c : b) : a);

        int firstdiff = mid - min;
        int seconddiff = max - mid;

        if (firstdiff == 1 && seconddiff == 1) {
            resarr[0] = 0;
            resarr[1] = 0;
            return resarr;
        }

        if (seconddiff >= firstdiff) {
            resarr[0] = findFirst(mid, min);
        } else {
            resarr[0] = findFirst(max, mid);
        }

        resarr[1] = max - min - 2;

        return resarr;
    }

    public int findFirst(int p, int k) {
        if (p - k <= 2) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        MovingStoneUntilConsecutive_1004 ob = new MovingStoneUntilConsecutive_1004();
        System.out.println(Arrays.toString(ob.numMovesStones(4, 7, 9)));
    }
}
