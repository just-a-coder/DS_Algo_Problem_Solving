package com.problemsolving.challenge_contests.template;

import java.util.ArrayList;
import java.util.List;

public class Adjacency_List_Template {
    public List<List<Integer>> generateAdjFromEdges(int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = edges.length;
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return adj;
    }
}
