package com.problemsolving.leetcode.heap.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Input: [1,2,3,4,5], k=4, x=3
 * Output: [1,2,3,4]
 */
public class FindKClosestElement_658 {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Pair());
        for (int i = 0; i < arr.length; i++) {
            int abs = Math.abs(arr[i] - x);
            Pair pair = new Pair(abs, arr[i]);
            pq.add(pair);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        PriorityQueue<Integer> ipq = new PriorityQueue<>();
        while (!pq.isEmpty()) {
            ipq.add(pq.poll().elem);
        }

        while (!ipq.isEmpty()) {
            result.add(ipq.poll());
        }
        return result;
    }

    static class Pair implements Comparator<Pair> {
        int freq;
        int elem;

        public Pair() { }

        public Pair(int freq, int elem) {
            this.freq = freq;
            this.elem = elem;
        }

        @Override
        public int compare(Pair p1, Pair p2) {
            if (p2.freq == p1.freq) {
                return p2.elem - p1.elem;
            }else{
                return p2.freq - p1.freq;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int k = 4, x = 3;
        System.out.println(findClosestElements(arr, k, x));
    }
}
