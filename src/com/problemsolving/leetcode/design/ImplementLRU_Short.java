package com.problemsolving.leetcode.design;

import java.util.LinkedHashMap;
import java.util.Map;

public class ImplementLRU_Short {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put(1, 11);
        cache.put(2, 22);
        cache.put(3, 33);
        cache.put(4, 44);

        int in = 2;
        System.out.println("Key: "+in+ "  Value:"+cache.get(in));
        in  = 1;
        System.out.println("Key: "+in+ "  Value:"+cache.get(in));
    }

}

class LRUCache extends LinkedHashMap<Integer, Integer>{
    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key){
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value){
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
        return size() > capacity;
    }
}
