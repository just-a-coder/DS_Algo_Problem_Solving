package com.problemsolving.leetcode.string.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class VerifyingAnAlienDictionary_953 {
    public boolean isAlienSorted(String[] words, String order) {
        Comparator<String> myComp = new Comparator<>(){
            public int compare(String s1, String s2){
                for (int i = 0; i < Math.min(s1.length(),s2.length()); i++) {
                   char c1 = s1.charAt(i), c2 = s2.charAt(i);
                   if(c1 != c2) {
                       return order.indexOf(c1) - order.indexOf(c2);
                   }
                }
                return s1.length() - s2.length();
            }
        };

        PriorityQueue<String> pq = new PriorityQueue<>(myComp);
        for(String word: words){
            pq.offer(word);
        }

        int i = 0;
        while(!pq.isEmpty()){
            if(!pq.poll().equals(words[i++])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = new String[]{"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        VerifyingAnAlienDictionary_953 ob = new VerifyingAnAlienDictionary_953();
        System.out.println(ob.isAlienSorted(words, order));
    }
}
