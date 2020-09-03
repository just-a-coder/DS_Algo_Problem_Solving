package com.problemsolving.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum_1302 {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int sum = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            sum = 0;
            while (size-- > 0) {
                TreeNode temp = queue.poll();
                if (temp.left == null && temp.right == null) {
                    sum += temp.val;
                }

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        return sum;
    }
}
