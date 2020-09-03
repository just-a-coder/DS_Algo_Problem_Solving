package com.problemsolving.leetcode.tree;

public class InsertIntoBinarySearchTree_701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        if(val > root.val){
            root.right =  insertIntoBST(root.right, val);
        }else{
            root.left =  insertIntoBST(root.left, val);
        }
        return root;
    }
}
