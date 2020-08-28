package com.problemsolving.leetcode.tree;


import java.util.Stack;

/**
 *  Given two binary trees and imagine that when you put one of them to cover the other,
 *  some nodes of the two trees are overlapped while the others are not.
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap,
 * then sum node values up as
 * the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 * https://leetcode.com/problems/merge-two-binary-trees/
 */


public class MergeBinaryTree_617 {

    // Recursive Approach
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 == null){
            return t2;
        }else if(t2 == null){
            return t1;
        }
        t1.val += t2.val;
        t1.left =  mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    // Iterative Approach
    public TreeNode mergeTrees_Iterative(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{t1,t2});
        while(!stack.isEmpty()){
            TreeNode temp[] = stack.pop();
            if(temp[0] == null || temp[1] == null){
                continue;
            }

            temp[0].val += temp[1].val;
            if(temp[0].left == null){
                temp[0].left = temp[1].left;
            }else{
                stack.push(new TreeNode[]{temp[0].left, temp[1].left});
            }

            if(temp[0].right == null){
                temp[0].right = temp[1].right;
            }else{
                stack.push(new TreeNode[]{temp[0].right, temp[1].right});
            }
        }
        return t1;
    }
}
