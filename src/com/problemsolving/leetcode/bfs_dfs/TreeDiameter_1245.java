package com.problemsolving.leetcode.bfs_dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeDiameter_1245 {
    int level;
    public int treeDiameter(int[][] edges) {
        level = 0;
        List<List<Integer>> adj = new ArrayList<>();
        int n = edges.length;
        // As we know, No of Node in tree is edges+1
        for(int i=0; i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0; i<n;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int farthest = bfs(0,adj);
        level = 0;
        int treefarthest = bfs(farthest,adj);
        return level;
    }

    private int bfs(int start, List<List<Integer>> adj){
        boolean visited[] = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                int curr = queue.remove();
                visited[curr] = true;
                List<Integer> neighbour = adj.get(curr);
                for(int nei: neighbour){
                    if(!visited[nei]){
                        queue.add(nei);
                    }
                }
                if(queue.isEmpty()){
                    return curr;
                }
            }
            ++level;
        }
        return 0;
    }
}
