package com.problemsolving.leetcode.heap.easy;

import java.util.PriorityQueue;

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 * int k = 3;
 * int[] arr = [4,5,8,2];
 * KthLargest kthLargest = new KthLargest(3, arr);
 * kthLargest.add(3);   // returns 4
 * kthLargest.add(5);   // returns 5
 * kthLargest.add(10);  // returns 5
 * kthLargest.add(9);   // returns 8
 * kthLargest.add(4);   // returns 8
 */
class KthLargest {
    PriorityQueue<Integer> pq;
    int k = 0;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
    }

    public int add(int val) {
        pq.add(val);
        while(pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }
}
