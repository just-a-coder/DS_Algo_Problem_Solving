package com.problemsolving.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinStepsInInfiniteGrid {
    public static void main(String[] args) {
        Integer arrA[] = new Integer[]{0, 1, 2};
        List<Integer> aList = Arrays.asList(arrA);
        Integer arrB[] = new Integer[]{0, 1, 2};
        List<Integer> bList = Arrays.asList(arrB);
        int result = coverPoints(aList, bList);
        System.out.println(result);
    }

    public static int coverPoints(List<Integer> A, List<Integer> B) {
        int totalStepsCount = 0;

        for (int i = 0; i < A.size() - 1; i++) {
            int stepsRequiredForA = A.get(i + 1) - A.get(i);
            if (stepsRequiredForA < 0)
                stepsRequiredForA = (-1 * stepsRequiredForA);

            int stepsRequiredForB = B.get(i + 1) - B.get(i);
            if (stepsRequiredForB < 0)
                stepsRequiredForB = (-1 * stepsRequiredForB);

            int maxStep = (stepsRequiredForA > stepsRequiredForB) ? stepsRequiredForA : stepsRequiredForB;
            totalStepsCount = totalStepsCount + maxStep;
        }
        return totalStepsCount;
    }
}
