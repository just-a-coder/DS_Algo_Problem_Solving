package com.problemsolving.hackerrank.algo;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        alist.add(5);
        alist.add(6);
        alist.add(7);

        List<Integer> bList = new ArrayList<>();
        bList.add(3);
        bList.add(6);
        bList.add(10);

        List<Integer> comparisonResult = compareTriplets(alist,bList);
        comparisonResult.forEach(i-> System.out.print(i+" "));
        System.out.println();
    }

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> comparisonList = new ArrayList<>();
        int aliceCount = 0, bobCount = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceCount++;
            } else if (a.get(i) < b.get(i)) {
                bobCount++;
            }
        }
        comparisonList.add(aliceCount);
        comparisonList.add(bobCount);
        return comparisonList;
    }
}
