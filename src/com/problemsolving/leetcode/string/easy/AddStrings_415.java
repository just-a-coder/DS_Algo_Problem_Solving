package com.problemsolving.leetcode.string.easy;

public class AddStrings_415 {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        int p1 = num1.length() -1;
        int p2 = num2.length() -1;
        while(p1 >= 0 || p2 >= 0){
            int x1 = (p1>=0)?num1.charAt(p1)-'0':0;
            int x2 = (p2>=0)?num2.charAt(p2)-'0':0;
            int value = (x1+x2+carry)%10;
            carry = (x1+x2+carry)/10;
            result.append(value);
            p1--;
            p2--;
        }
        
        if(carry>0){
            result.append(carry);
        }
       
        return result.reverse().toString();
    }


    public static void main(String[] args) {
        AddStrings_415 ob = new AddStrings_415();
        String num1 = "6913259244";
        String num2 = "71103343";
        System.out.println(ob.addStrings(num1, num2));
    }
}
