/*
package com.problemsolving.challenge_contests.test;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Tree {
    public int x;
    public Tree l;
    public Tree r;
}

class Solution {
    int result = 0;
    public int solution(Tree T) {
        Set<Integer> hset = new HashSet<>();
        traverse(T, hset);
        return result;
    }

    public void checkDup(Tree node){
        Set<Integer> hset = new HashSet<>();
        String str = "";
        StringBuilder sb = new StringBuilder();
        traverse(node,sb);
        //traverse(node, hset);
    }

    public void traverse(Tree node, StringBuffer sb){
        if(node == null || sb.toString().contains(String.valueOf(node.x))) return;
        sb.append(node.x);
        result = Math.max(result,sb.length());
        if(node.l != null) traverse(node.l,sb);
        if(node.r != null) traverse(node.r,sb);
    }

    public void traverse(Tree node, String str){
        if(node == null || str.contains(String.valueOf(node.x))) return;
        str += String.valueOf(node.x);
        result = Math.max(result,str.length());
        if(node.l != null) traverse(node.l,str);
        if(node.r != null) traverse(node.r,str);
    }


    public void traverse(Tree node, String str){
        if(node == null || str.contains(String.valueOf(node.x))) return;
        str = str + "" + String.valueOf(node.x);
        result = Math.max(result,str.length());
        if(node.l != null) traverse(node.l,str);
        if(node.r != null) traverse(node.r,str);
    }

    public void traverse(Tree node, Set<Integer> hset){
        if(node == null || hset.contains(node.x)) return;
        if(!hset.contains(node.x)){
            hset.add(node.x);
            result = Math.max(result,hset.size());
        }
        if(node.l != null) traverse(node.l,hset);
        if(node.r != null) traverse(node.r,hset);
    }
}*/
