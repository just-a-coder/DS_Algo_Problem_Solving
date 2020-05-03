package com.problemsolving.hackerrank.algo.easy;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> gradeList = new ArrayList<>();
        gradeList.add(28);
        gradeList.add(73);
        gradeList.add(67);
        gradeList.add(85);
        gradeList.add(99);
        gradeList.add(100);
        List<Integer> gradingStundentNums = gradingStudents(gradeList);
        gradingStundentNums.forEach(i -> System.out.println(i));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> gradeNums = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int tempGrade = grades.get(i) % 5;
            if ((tempGrade == 3 || tempGrade == 4) && grades.get(i) > 37) {
                int temp = grades.get(i) / 5;
                gradeNums.add((temp + 1) * 5);
            } else {
                gradeNums.add(grades.get(i));
            }
        }
        return gradeNums;
    }
}
