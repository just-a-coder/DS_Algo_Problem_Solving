package com.problemsolving.leetcode.string;

import java.util.Arrays;
import java.util.Comparator;

public class ReOrderLogFiles_937 {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> myComp = (s1, s2) -> {
            int s1FirstSpace = s1.indexOf(' ');
            int s2FirstSpace = s1.indexOf(' ');
            char s1FirstCharacter = s1.charAt(s1FirstSpace+1);
            char s2FirstCharacter = s2.charAt(s2FirstSpace+1);
            if(s1FirstCharacter <= '9'){
                // First One is Digit, so if second one is digit, keep as it is, else move second to front
                if(s2FirstCharacter <= '9') return 0;
                else return 1;
                // First one is let if second one is digit, first one will be there in front
            }else if(s2FirstCharacter <= '9'){
                return -1;
                // If both are let
            }else{
                int compVal = s1.substring(s1FirstSpace).compareTo(s2.substring(s2FirstSpace));
                if(compVal == 0){
                    return s1.substring(0,s1FirstSpace).compareTo(s2.substring(s2FirstSpace));
                }else{
                    return compVal;
                }
            }
        };
        Arrays.sort(logs, myComp);
        return logs;
    }

    public static void main(String[] args) {
        String logs[] = new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        ReOrderLogFiles_937 ob = new ReOrderLogFiles_937();
        System.out.println(Arrays.toString(ob.reorderLogFiles(logs)));
    }
}
