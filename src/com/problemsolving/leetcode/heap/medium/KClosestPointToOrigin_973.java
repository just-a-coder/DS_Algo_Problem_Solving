package com.problemsolving.leetcode.heap.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Input: points = [[3,3],[5,-1],[-2,4]], K = 2
 * Output: [[3,3],[-2,4]]
 * (The answer [[-2,4],[3,3]] would also be accepted.)
 */
public class KClosestPointToOrigin_973 {
    public static int[][] kClosest(int[][] points, int K) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Pair());
        for(int i = 0; i< points.length; i++){
            int distance = (int)Math.pow(points[i][0],2) + (int)Math.pow(points[i][1],2);
            Pair pr = new Pair(distance,i);
            maxHeap.add(pr);
            if(maxHeap.size()>K){
                maxHeap.poll();
            }
        }
        int resultarr[][] = new int[K][2];
        int i =0;
        while(!maxHeap.isEmpty()){
            Pair pr = maxHeap.poll();
            resultarr[i++] = points[pr.index];
        }
        return resultarr;
    }

    static class Pair implements Comparator<Pair> {
        int freq;
        int index;
        public Pair(){}
        public Pair(int freq, int index){
            this.freq = freq;
            this.index = index;
        }

        @Override
        public int compare(Pair p1, Pair p2){
            return p2.freq - p1.freq;
        }
    }

    public static void main(String[] args) {
        int points[][] = new int[][]{{3,3},{5,-1},{-2,4}};
        int k = 2;
        int mat[][] = kClosest(points,k);
        for (int arr[] : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
