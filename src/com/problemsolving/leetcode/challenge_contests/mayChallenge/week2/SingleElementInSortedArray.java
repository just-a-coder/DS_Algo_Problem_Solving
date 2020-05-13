package com.problemsolving.leetcode.challenge_contests.mayChallenge.week2;

public class SingleElementInSortedArray {
/*    public static int singleNonDuplicate(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }*/

    public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (mid % 2 == 1)
                mid--;
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }


    public static void main(String[] args) {
        int nums[] = new int[]{3, 3, 2};
        System.out.println(singleNonDuplicate(nums));
    }
}
