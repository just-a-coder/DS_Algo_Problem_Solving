package com.problemsolving.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewOfBinaryTree_199 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return result;
        helper(root,0);
        return result;
    }

    private void helper(TreeNode node, int level){
        if(level == result.size()){
            result.add(node.val);
        }

        if(node.right != null){
            helper(node.right, level+1);
        }

        if(node.left != null){
            helper(node.left, level+1);
        }
    }

    public List<Integer> rightSideView_Iterative(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                TreeNode temp = queue.poll();

                if(temp != null && temp.left != null){
                    queue.offer(temp.left);
                }

                if(temp != null && temp.right != null){
                    queue.offer(temp.right);
                }

                if(size == 0){
                    result.add(temp.val);
                }
            }
        }
        return result;
    }
}
