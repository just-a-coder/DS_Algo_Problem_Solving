package com.problemsolving.hackerrank.algo;

public class TimeConversion {
    public static void main(String[] args) {
        String str = "07:05:45PM";
        String str1 = "12:00:00AM";
        String convertedTime = timeConversion(str1);
        System.out.println(convertedTime);
    }

    static String timeConversion(String str) {
        String arr[] = str.split(":");
        int hourVal = Integer.parseInt(arr[0]);

        if (str.charAt(str.length() - 2) == 'P') {
            if (hourVal != 12) {
                hourVal = hourVal + 12;
            }
            str = hourVal + ":" + arr[1] + ":" + arr[2];
            str = str.replace("PM", "");
            return str;
        } else {
            if (hourVal == 12) {
                str = "00" + ":" + arr[1] + ":" + arr[2];
            }
            str = str.replace("AM", "");
            return str;
        }
    }
}
