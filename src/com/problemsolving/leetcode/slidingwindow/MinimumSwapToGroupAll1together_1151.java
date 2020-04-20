package com.problemsolving.leetcode.slidingwindow;

public class MinimumSwapToGroupAll1together_1151 {
    public int minSwaps(int[] data) {
        int onec = 0, zeroc = 0, maxonec = 0, winonec = 0;

        for (int i = 0; i < data.length; i++) {
            onec += data[i];
        }

        if (onec == 0 || onec == 1) return 0;

        for (int i = 0, start = 0; i < data.length; i++) {
            winonec += data[i];
            if (i - start + 1 == onec) {
                maxonec = Math.max(maxonec, winonec);
                winonec -= data[start++];
            }
        }
        return onec - maxonec;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,0, 1, 0, 1};
        MinimumSwapToGroupAll1together_1151 ob = new MinimumSwapToGroupAll1together_1151();
        System.out.println(ob.minSwaps(arr));
    }
}
