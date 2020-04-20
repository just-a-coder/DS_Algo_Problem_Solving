package com.problemsolving.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {

    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(6);
        alist.add(13);
        alist.add(15);
        alist.add(17);

        wave(alist);
        for (Integer integer : alist) {
            System.out.print(integer +" ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for (int i = 1; i < A.size(); i = i + 2) {
            if (A.get(i) > A.get(i - 1)) {
                swap(A,i,i-1);
            }
            if ((i+1)<A.size() && A.get(i) > A.get(i + 1)) {
                swap(A,i,i+1);
            }
        }
        return A;
    }

    private static void swap(ArrayList<Integer> A, int firstIndex, int secondIndex) {
        int temp = A.get(firstIndex);
        A.set(firstIndex,A.get(secondIndex));
        A.set(secondIndex, temp);
    }
}
