package com.problemsolving.leetcode.challenge_contests.mayChallenge.week1_7th;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
/*	public static int majorityElement(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int count = hmap.getOrDefault(nums[i],0)+1;
			if(count>n/2){
				return nums[i];
			}else{
				hmap.put(nums[i],count);
			}
			
		}
        return -1;
	}*/

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

	public static void main(String[] args) {
		int arr[] = new int[] {1,1,1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println(majorityElement(arr));
	}
}
