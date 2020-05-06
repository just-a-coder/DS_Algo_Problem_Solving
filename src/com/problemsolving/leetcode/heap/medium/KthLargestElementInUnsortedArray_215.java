package com.problemsolving.leetcode.heap.medium;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Find the kth largest element in an unsorted array. Note that it is the
 * kth largest element in the sorted order, not the kth distinct element.
 * Example 1:
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 */
public class KthLargestElementInUnsortedArray_215 {
    public static int findKthLargest(int[] nums, int k) {
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	for(int i=0; i<nums.length; i++){
    		pq.add(nums[i]);
    		if(pq.size()>k){
    		    pq.poll();
            }
    	}
    	return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(arr, k));
    }
}
