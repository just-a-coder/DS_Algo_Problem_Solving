package com.problemsolving.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddOneToTheNumber {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(0);
        aList.add(0);
        aList.add(1);
        aList.add(9);
        List<Integer> resultArr = plusOne(aList);
        resultArr.forEach(i -> System.out.print(i + " "));
    }


    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();
        int i = n - 1;
        if (A.get(i) != 9) {
            A.set(i, A.get(i) + 1);
        } else {
            while (i >= 0 && A.get(i) == 9) {
                A.set(i, 0);
                i--;
            }

            if (i <= 0 && A.get(0) == 0) {
                A.add(0, 1);
            } else
                A.set(i, A.get(i) + 1);
        }

        // Code to remove Leading Zeros
        while (A.get(0) == 0) {
            A.remove(0);
        }
        return A;
    }
}