package com.problemsolving.hackerrank.algo;

import java.util.*;

public class MigratoryBirdProblem {

    public static void main(String[] args) {
        Integer arr[] = new Integer[]{1, 4, 4, 4, 5, 3};
        List<Integer> alist = Arrays.asList(arr);
        int result = migratoryBirds(alist);
        System.out.println(result);
    }

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (hmap.containsKey(arr.get(i))) {
                hmap.put(arr.get(i), hmap.get(arr.get(i)) + 1);
            } else {
                hmap.put(arr.get(i), 1);
            }
        }
        int highestFrequency = 0;
        int highestFrequencyCount = 0;

        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > highestFrequencyCount) {
                highestFrequencyCount = entry.getValue();
                highestFrequency = entry.getKey();
            }
        }
        return highestFrequency;
    }
}
