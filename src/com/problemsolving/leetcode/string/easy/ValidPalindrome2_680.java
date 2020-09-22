package com.problemsolving.leetcode.string.easy;

public class ValidPalindrome2_680 {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() -1, len = s.length();
        System.out.println("Start: "+s);
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return isPalindrome(s,start+1,end) ||
                        isPalindrome(s,start,end-1);
            }
        }
        return true;

    }

    private boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start++) == s.charAt(end--)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome2_680 ob = new ValidPalindrome2_680();
        String s = "cbbce";
        System.out.println(ob.validPalindrome(s));
    }
}
