package com.problemsolving.leetcode.slidingwindow;

/**
 * Input: [1,2,1]
 * Output: 3
 * Explanation: We can collect [1,2,1].
 */

public class FruitsIntoBasket_904 {
    public int totalFruit(int[] tree) {
        int start = 0, res = 0, k = 2;
        int arr[] = new int[tree.length];

        for (int i = 0; i < tree.length; i++) {
            if (arr[tree[i]]++ == 0) {
                k--;
            }

            while (k < 0) {
                if (--arr[tree[start++]] == 0) {
                    k++;
                }
            }
            res = Math.max(res, i-start+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int tree[] = new int[]{3,3,3,1,2,1,1,2,3,3,4};
        FruitsIntoBasket_904 ob = new FruitsIntoBasket_904();
        System.out.println(ob.totalFruit(tree));
    }
}
