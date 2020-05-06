package com.problemsolving.leetcode.heap.easy;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Input: [2,7,4,1,8,1]
 * Output: 1
 * Explanation:
 * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 * we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
 */
public class LastStoneWeight_1046 {
    public static int lastStoneWeight(int[] stones) {
    	PriorityQueue<Integer> pq = new PriorityQueue(Comparator.reverseOrder());
    	for(int i=0; i< stones.length; i++){
    		pq.add(stones[i]);
    	}

    	while(pq.size()>1){
    		int firstMax = pq.poll();
    		int secondMax = pq.poll();
    		if(firstMax > secondMax){
    			pq.add(firstMax - secondMax);
    		}
    	}
    	return (pq.isEmpty())?0:pq.poll();
    }

    public static void main(String[] args) {
        int stones[] = new int[]{1,2,3,4,5};
        System.out.println(lastStoneWeight(stones));
    }
}
