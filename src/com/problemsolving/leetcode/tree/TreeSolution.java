package com.problemsolving.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSolution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            while(size-- > 0){
                TreeNode temp = queue.poll();
                if(temp.left != null){
                    if(isLeaf(temp.left)){
                        return level+1;
                    }else{
                        queue.add(temp.left);
                    }
                }

                if(temp.right != null){
                    if(isLeaf(temp.right)){
                        return level+1;
                    }else{
                        queue.add(temp.right);
                    }
                }

            }
        }
        return level;
    }

    private boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
}
