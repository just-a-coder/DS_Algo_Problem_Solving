package com.problemsolving.leetcode.bfs_dfs;

import java.util.LinkedList;
import java.util.Queue;

class FindBottomLeftValue_513 {
    // Working Code
/*    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int result = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i< size; i++){
                TreeNode node = queue.remove();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                if(i == 0){
                    result = node.val;
                }
            }
        }
        return result;
    }*/
}