package com.problemsolving.leetcode.tree;

public class ClosestBinarySearchTreeValue_270 {
    public int closestValue(TreeNode root, double target) {
        int result = root.val;
        while(root != null){
            if(Math.abs(target - root.val) < Math.abs(root.val - target)){
                result = root.val;
            }
            root = (root.val < target)?root.right:root.left;
        }
        return result;
    }
}
