package com.problemsolving.leetcode.tree;

public class ValidateBinarySearchTree_98 {
    public boolean isValidBST(TreeNode root){
        return isValidBSTOp(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBSTOp(TreeNode root, long minValue, long maxValue) {
        if(root == null) return true;
        if(root.val <= minValue || root.val >= maxValue) return false;
        return  isValidBSTOp(root.left, minValue, root.val) &&
                isValidBSTOp(root.right, root.val, maxValue);
    }
}
