package com.problemsolving.challenge_contests.mayChallenge.week2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindTheTownJudge {
    public static int findJudge(int N, int[][] trust) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int m = trust.length;
        if (m == 0) return N;
        if (m == 1) return trust[0][1];
        for (int i = 0; i < m; i++) {
            hmap.put(trust[i][1], hmap.getOrDefault(trust[i][1], 0) + 1);
        }

        int maxElemCount = 0, maxelem = 0;
        for (Integer in : hmap.keySet()) {
            if (hmap.get(in) > maxElemCount) {
                maxelem = in;
                maxElemCount = hmap.get(in);
            }
        }

        Set<Integer> hset = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            hset.add(i);
        }

        boolean flag = true;
        for (int i = 0; i < trust.length; i++) {
            if (trust[i][1] == maxelem) {
                hset.remove(trust[i][0]);
            }

            if (trust[i][0] == maxelem) {
                flag = false;
            }
        }
        if (flag)
            hset.remove(maxelem);

        if (hset.isEmpty()) return maxelem;
        else
            return -1;
    }

    public static void main(String[] args) {
        int trust[][] = new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}};
        int N = 4;
        System.out.println(findJudge(N, trust));
    }
}
