package com.problemsolving.leetcode.array;

import java.util.*;

public class HighFive_1086 {
    public static int[][] highFive(int[][] items) {
        Map<Integer, List<Integer>> hmap = new HashMap<>();
        for(int i = 0; i < items.length; i++){
            List<Integer> alist = hmap.getOrDefault(items[i][0], new ArrayList<>());
            alist.add(items[i][1]);
            hmap.put(items[i][0], alist);
        }

        int[][] result= new int[hmap.size()][2];
        int resultindex = 0;
        for(int in: hmap.keySet()){
            List<Integer> currList = hmap.get(in);
            Collections.sort(currList, Collections.reverseOrder());
            int count = 1, sum = 0;
            for(int i = 0; i < currList.size(); i++,count++){
                sum += currList.get(i);
                if(count == 5) break;
            }
            sum = sum/count;
            result[resultindex][0] = in;
            result[resultindex++][1] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1,91},{1,92},{2,93},{2,97},{1,60},
                {2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        highFive(matrix);
    }
}

