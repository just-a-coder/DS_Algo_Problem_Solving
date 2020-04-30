package com.problemsolving.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

public class GeneratePossibleStringMoves_293 {
    public static List<String> generatePossibleNextMoves(String s) {
        List<String> resultlist = new ArrayList<>();
        int start =0, end = s.length()-1;
        boolean flag = false;
        while (start < end) {
            StringBuilder sb = new StringBuilder(s);
            if (s.substring(start, start + 2).equals("++")) {
                sb.replace(start,start+2,"--");
                flag = true;
            }
            if(flag)
            resultlist.add(sb.toString());
            flag = false;
            start++;
        }
        return resultlist;
    }

    public static void main(String[] args) {
        String s = "000111011101";
        generatePossibleNextMoves(s).forEach(i-> System.out.println(i));
    }
}
