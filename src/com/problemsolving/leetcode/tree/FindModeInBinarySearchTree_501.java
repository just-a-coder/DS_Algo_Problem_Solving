package com.problemsolving.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class FindModeInBinarySearchTree_501 {
    int maxFreq = 0, count = 1;
    Integer prev = null;
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];
        traverse(root);
        int arr[] = new int[list.size()];
        for(int i = 0; i<arr.length; i++)
            arr[i] = list.get(i);
        return arr;
    }


    private void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.left);
        if(prev != null){
            if(prev == root.val){
                count++;
            }else{
                count = 1;
            }
        }

        if(count > maxFreq){
            list.clear();
            list.add(root.val);
            maxFreq = count;
        }else if(count == maxFreq){
            list.add(root.val);
        }
        prev = root.val;
        traverse(root.right);
    }
}
