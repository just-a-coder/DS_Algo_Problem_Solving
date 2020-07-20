package com.problemsolving.leetcode.challenge_contests.contests;

import com.problemsolving.leetcode.heap.medium.SortCharacterByFrequency_451;

import java.util.*;

public class Contest_Weekly {


    public static int fewestCoins(String coins) {
        int result = Integer.MAX_VALUE, start = 0;
        HashMap<Character, Integer> original = new HashMap<>();
        for(int i =0; i< coins.length(); i++){
            original.put(coins.charAt(i), original.getOrDefault(coins.charAt(i), 0)+1);
        }

        HashMap<Character, Integer> current = new HashMap<>();
        for(int i = 0; i < coins.length() ; i++){
            current.put(coins.charAt(i), current.getOrDefault(coins.charAt(i), 0)+1);
            while(current.keySet().equals(original.keySet())){
                result = Math.min(result, i-start+1);
                int freq = current.get(coins.charAt(start));
                if(freq == 1){
                    current.remove(coins.charAt(start));
                }else{
                    current.put(coins.charAt(start), --freq);
                }
                start++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String str = "dabbcabcd";
        System.out.println(fewestCoins(str));
    }
}
