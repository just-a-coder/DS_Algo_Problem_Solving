package com.problemsolving.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyInteger_1394 {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < arr.length ; i++){
            hmap.put(arr[i], hmap.getOrDefault(arr[i],0)+1);
        }

        int largest = 0;
        for(Integer in: hmap.keySet()){
            int val = hmap.get(in);
            if(in == val && val >= largest){
                largest = val;
            }
        }

        if(largest > 0){
            return largest;
        }else{
            return -1;
        }
    }
}
