package com.problemsolving.leetcode.misc.easy;

import com.problemsolving.challenge_contests.aprilChallange.week1.HappyNumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HappyNumber_202 {

    // Floyd Warshall Cycle Detecting Algorithm
    public boolean isHappy(int n) {
        int slowptr = n;
        int fastPtr = getNext(n);
        while( fastPtr != 1 && slowptr != fastPtr){
            slowptr = getNext(slowptr);
            fastPtr = getNext(getNext(fastPtr));
        }
        return fastPtr == 1;
    }

    // Using HashSet
    public boolean isHappy_hash(int n) {
        Set<Integer> hSet = new HashSet<>();
        while( n != 1){
            n = getNext(n);
            if(hSet.contains(n))
                return false;
            else
                hSet.add(n);
        }
        return n == 1;
    }

    public int getNext(int n){
        int sum  = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            sum += rem * rem;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 22;
        HappyNumber_202 hp = new HappyNumber_202();
        System.out.println("Happy Number: "+hp.isHappy(n));
    }
}
