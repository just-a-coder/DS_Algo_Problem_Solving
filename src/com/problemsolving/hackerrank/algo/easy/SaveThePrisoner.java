package com.problemsolving.hackerrank.algo.easy;

public class SaveThePrisoner {

    public static void main(String[] args) {
        int n = 3, m = 7, s = 3;
        int prisonerNum = saveThePrisoner(n, m, s);
        System.out.println(prisonerNum);
    }

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
        int a = s+m-1;
        if(a>n){
            if(a%n==0){
                return n;
            }
            return a%n;
        }

        return a;
    }
}
