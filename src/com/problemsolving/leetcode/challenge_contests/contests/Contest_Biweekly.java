package com.problemsolving.leetcode.challenge_contests.contests;

import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.stream.IntStream;

public class Contest_Biweekly {

    public static int getWinner(int[] arr, int k) {
        if(k >= arr.length || arr.length == k) return IntStream.of(arr).max().getAsInt();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
           queue.add(arr[i]);
        }
        int count = 0, i = 0, result = 0;
        while(count < k){
            int first = queue.pollFirst();
            int second = queue.pollFirst();
            if (first > second) {
                queue.remove(second);
                queue.addLast(second);
                count++;
            } else {
                queue.remove(first);
                queue.addLast(first);
                count = 1;
            }

            if(count == k){
                result = queue.pollFirst();
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,1,3,5,4,6,7};
        int k = 2;
        System.out.println(getWinner(arr,k));
    }
}
