package com.problemsolving.leetcode.graph;

public class FindTownJudge_997 {
    public int findJudgeUsingIndegreeOutDegree(int N, int[][] trust) {
        if(trust.length<N-1) return -1;
        int indegree[] = new int[N+1];
        int outdegree[] = new int[N+1];
        for(int arr[]: trust){
            outdegree[arr[0]]++;
            indegree[arr[1]]++;
        }

        for(int i=1; i<=N; i++){
            if(indegree[i]==N-1 && outdegree[i]==0){
                return i;
            }
        }
        return -1;
    }

    public int findJudgeUsingOneArray(int N, int[][] trust) {
        if(trust.length<N-1) return -1;
        int relation[] = new int[N+1];
        for(int arr[]: trust){
            relation[arr[0]]--;
            relation[arr[1]]++;
        }

        for(int i=1; i<=N; i++){
            if(relation[i]==N-1){
                return i;
            }
        }
        return -1;
    }
}
