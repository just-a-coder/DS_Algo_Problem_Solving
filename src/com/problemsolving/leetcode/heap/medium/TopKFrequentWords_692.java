package com.problemsolving.leetcode.heap.medium;

import java.util.*;

/**
 * Given a non-empty list of words, return the k most frequent elements.
 * Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency,
 * then the word with the lower alphabetical order comes first.
 */
public class TopKFrequentWords_692 {
    public static List<String> topKFrequent(String[] words, int k) {
    	Map<String, Integer> hmap = new HashMap<>();
    	List<String> result = new ArrayList<>();
    	for(String word:words){
    		hmap.put(word, hmap.getOrDefault(word,0)+1);
    	}

    	PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Pair());
    	for(String mapword: hmap.keySet()){
    		Pair pr = new Pair(hmap.get(mapword), mapword);
            maxHeap.add(pr);
    	}
    	
    	int count = 0;
    	while(!maxHeap.isEmpty() && count<k){
    		result.add(maxHeap.poll().elem);
    		count++;
    	}
    	return result;
    }


    static class Pair implements Comparator<Pair> {
        int freq;
        String elem;

        public Pair() { }

        public Pair(int freq, String elem) {
            this.freq = freq;
            this.elem = elem;
        }

        @Override
        public int compare(Pair p1, Pair p2) {
            if (p1.freq == p2.freq) {
                return p1.elem.compareTo(p2.elem);
            }else{
                return p2.freq - p1.freq;
            }
        }

    }

    public static void main(String[] args) {
        String words[] = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        System.out.println(topKFrequent(words, k));
    }
}
