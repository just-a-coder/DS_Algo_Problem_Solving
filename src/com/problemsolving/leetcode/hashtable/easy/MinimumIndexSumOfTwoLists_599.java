package com.problemsolving.leetcode.hashtable.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumIndexSumOfTwoLists_599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> listmap1 = new HashMap<>();
        Map<String, Integer> listmap2 = new HashMap<>();
        String result = "";
        for(int i =0; i < list1.length; i++){
            listmap1.put(list1[i],i+1);
        }
        for(int i =0; i < list2.length; i++){
            listmap2.put(list2[i],i+1);
        }
        int min = Integer.MAX_VALUE;
        for(String str: listmap1.keySet()){
            int first = listmap1.get(str);
            if(listmap2.containsKey(str)){
                first += listmap2.get(str);
                listmap2.remove(str);
                if(first == min){
                    min = first;
                    result = result +":"+ str;
                }else if(first < min){
                    min = first;
                    result = str;
                }
            }
        }

        for(String str: listmap2.keySet()){
            int first = listmap2.get(str);
            if(listmap1.containsKey(str)){
                first += listmap1.get(str);

                if(first == min){
                    min = first;
                    result = result +":"+ str;
                }else if(first < min){
                    min = first;
                    result = str;
                }
            }
        }
        String resultarr[] = result.split(":");
        return resultarr;
    }

    public static void main(String[] args) {
        String list1[] = {"Shogun","Tapioca Express","Burger King","KFC"};
        String list2[] = {"KFC","Shogun","Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }
}
