package com.problemsolving.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix_1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            int smallest = Integer.MAX_VALUE, smallestIndex = -1;
            for(int j = 0; j < matrix[0].length; j++){
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                    smallestIndex = j;
                }
            }


            for(int k = 0; k < matrix.length; k++){
                if(smallest < matrix[k][smallestIndex]){
                    break;
                }
                if(k == matrix.length-1){
                    result.add(smallest);
                }
            }
        }
        return result;
    }
}
