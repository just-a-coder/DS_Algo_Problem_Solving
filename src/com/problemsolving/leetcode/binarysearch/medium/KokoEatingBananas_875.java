package com.problemsolving.leetcode.binarysearch.medium;

/**
 * Input: piles = [3,6,7,11], H = 8
 * Output: 4
 */
public class KokoEatingBananas_875 {
    public static int minEatingSpeed(int[] arr, int k) {
        long start = 0, end =0, mid, res=0;
        for (int i = 0; i < arr.length; i++) {
            end += arr[i];
        }
        while (start <= end) {
            mid = start+(end-start)/2;
            if (isValid(arr, k, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }
        return (int)res;
    }

    private static boolean isValid(int arr[], int k, long max) {
        int count = 0;
        if(max == 0) return false;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i]/max;
            count += (arr[i]%max != 0)?1:0;
            if(count>k) return false;
        }
        if(count <= k) return true;
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{332484035, 524908576, 855865114, 632922376, 222257295, 690155293, 112677673, 679580077, 337406589, 290818316, 877337160, 901728858, 679284947, 688210097, 692137887, 718203285, 629455728, 941802184};
        int k = 823855818;
        System.out.println(minEatingSpeed(arr, k));
    }
}