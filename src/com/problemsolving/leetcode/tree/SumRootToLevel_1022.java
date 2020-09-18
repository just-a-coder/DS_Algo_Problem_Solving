package com.problemsolving.leetcode.tree;

public class SumRootToLevel_1022 {
    int sum;
    public int sumRootToLeaf(TreeNode root) {
        sum = 0;
        traverse(root,0);
        return sum;
    }

    private void traverse(TreeNode root, int val){
        if(root == null) return;
        if(isLeafNode(root)){
            sum += val * 2 + root.val;
        }else{
            int curr = val * 2 + root.val;
            traverse(root.left, curr);
            traverse(root.right, curr);
        }
    }

    private boolean isLeafNode(TreeNode root){
        return (root.left == null) && (root.right == null);
    }
}
