package com.problemsolving.leetcode.string.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueStringEmails_929 {
    public static int numUniqueEmails(String[] emails) {
        Set<String> hset = new HashSet<>();
        for (String str : emails) {
            int index = str.indexOf("@");
            String first = str.substring(0,index);
            String rest = str.substring(index);
            if (first.contains("+")) {
                first = first.substring(0,first.indexOf("+"));
            }
            String dotReplace = first.replaceAll("\\.","");
            hset.add(dotReplace+rest);
        }
        return hset.size();
    }

    public static void main(String[] args) {
        String emails[] = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
}
