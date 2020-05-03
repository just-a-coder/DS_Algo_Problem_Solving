package com.problemsolving.hackerrank.algo.easy;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        int year = 1918;
        String date = dayOfProgrammer(year);
        System.out.println(date);
    }

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        String date = "09." + year;
        boolean leapYearFlag = false;
        int day = 0;

        if (year < 1918) {
            if (year % 4 == 0) {
                leapYearFlag = true;
            }
        } else if (year > 1918) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                leapYearFlag = true;
            }
        } else {
            day = 26;
        }

        if (leapYearFlag && day == 0) {
            day = 256 - 244;
        } else if (!leapYearFlag && day == 0) {
            day = 256 - 243;
        } else {
            day = 26;
        }
        date = day + "." +date;
        return date;
    }
}
