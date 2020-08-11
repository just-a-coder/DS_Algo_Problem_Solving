package com.problemsolving;

import java.util.Collections;

public class Main {

    private static String reverse(String str) {
        String result = "";
        int beginIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                result = result + reverseString(str.substring(beginIndex, i)) + str.charAt(i);
                beginIndex = i + 1;
            }
        }
        result = result + reverseString(str.substring(beginIndex));
        return result;
    }

    private static String reverseString(String str) {

        int end = str.length() - 1;
        int start = 0;
        char arr[] = str.toCharArray();
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "Abc18@gmail.com";
        // O/p: 81cbA@liamg.moc
        System.out.println(reverse(str));
    }
}
