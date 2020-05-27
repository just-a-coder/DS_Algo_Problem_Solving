package com.problemsolving.leetcode.bfs_dfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class JumpGame3_1306 {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        Set<Integer> hset = new HashSet<>();
        while(!queue.isEmpty()){
            int index = queue.remove();
            if(index < 0 || index >= arr.length || hset.contains(index)) continue;
            int indexval = arr[index];
            if(indexval == 0) return true;
            hset.add(index);
            queue.add(index + indexval);
            queue.add(index - indexval);
        }
        return false;
    }
}
