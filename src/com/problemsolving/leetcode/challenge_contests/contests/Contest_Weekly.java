package com.problemsolving.leetcode.challenge_contests.contests;

import com.problemsolving.leetcode.heap.medium.SortCharacterByFrequency_451;

import java.util.*;

public class Contest_Weekly {

    public static int[] getStrongest(int[] arr, int k) {
        int n = arr.length;
        if(n == 1 && k == 1) return arr;
        Arrays.sort(arr);
        int medindex = (n-1)/2;
        int median = arr[medindex];
        int resarr[] = new int[k];
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Pair());
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i]-median);
            Pair pr = new Pair(diff,arr[i]);
            maxHeap.add(pr);
        }

        int x = 0;
        while (!maxHeap.isEmpty()) {
            Pair pr = maxHeap.poll();
            resarr[x++] = pr.elem;
            if(x==k) return resarr;
        }
        return resarr;
    }

    static class Pair implements Comparator<Pair> {
        int freq;
        int elem;
        public Pair(){}
        public Pair(int freq, int elem){
            this.freq = freq;
            this.elem = elem;
        }

        @Override
        public int compare(Pair p1, Pair p2){
            if (p2.freq == p1.freq) {
                return p2.elem - p1.elem;
            }else{
                return p2.freq - p1.freq;
            }
        }
    }

        public static void main (String[]args){
            int arr[] = new int[]{3,2,1,4,5};
            System.out.println(Arrays.toString(getStrongest(arr, 2)));
        }
    }
