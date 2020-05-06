package com.problemsolving.leetcode.heap.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 * Input:
 * "tree"
 * Output:
 * "eert"
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 */
public class SortCharacterByFrequency_451 {
    public static String frequencySort(String s) {
    	StringBuilder sb = new StringBuilder();
    	PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Pair());
    	Map<Character, Integer> hmap = new HashMap<>();
    	for(int i=0; i<s.length(); i++){
    		char c = s.charAt(i);
    		hmap.put(c, hmap.getOrDefault(c,0)+1);
    	}

    	for(char c: hmap.keySet()){
    		Pair pr = new Pair(hmap.get(c),c);
    		maxHeap.add(pr);
    	}

    	while(!maxHeap.isEmpty()){
    		Pair pr = maxHeap.poll();
    		for(int i=0; i<pr.freq;i++){
    			sb.append((char)pr.elem);
    		}
    	}
    	return sb.toString();
    }

    static class Pair implements Comparator<Pair> {
        int freq;
        int elem;
        public Pair(){}
        public Pair(int freq, int elem){
            this.freq = freq;
            this.elem = elem;
        }

        @Override
        public int compare(Pair p1, Pair p2){
            return p2.freq - p1.freq;
        }
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
