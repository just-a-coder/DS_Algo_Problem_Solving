package com.problemsolving.leetcode.design;

import java.util.HashMap;
import java.util.Map;

public class ImplementLRU_Detailed {
    public static void main(String[] args) {

    }
}

class DLinkedNode{
    int key, value;
    DLinkedNode prev, next;
    public DLinkedNode(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class LRU_Cache{
    int capacity;
    DLinkedNode head = null, tail = null;
    Map<Integer, DLinkedNode> hmap = new HashMap<>();
    public LRU_Cache(int capacity){
        this.capacity = capacity;
    }

    public void delete(DLinkedNode node){
        if(node.prev != null){
            node.prev.next = node.next;
        }else{
            head = node.next;
        }

        if(node.next != null){
            node.next.prev = node.prev;
        }else{
            tail = node.prev;
        }
    }

    public void setToHead(DLinkedNode node){
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        if(tail == null){
            tail = node;
        }
        head = node;
    }

    public int get(int key){
        if(hmap.containsKey(key)){
            DLinkedNode node = hmap.get(key);
            delete(node);
            setToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value){
        if(hmap.containsKey(key)){
            DLinkedNode oldNode = hmap.get(key);
            delete(oldNode);
            setToHead(oldNode);
            oldNode.value = value;
        }else{
            DLinkedNode node = new DLinkedNode(key, value);
            if(hmap.size() > capacity){
                hmap.remove(tail.value);
                delete(tail);
                hmap.put(key, node);
                setToHead(node);
            }
        }
    }
}
