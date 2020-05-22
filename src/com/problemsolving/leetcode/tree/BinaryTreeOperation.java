package com.problemsolving.leetcode.tree;

import java.util.*;

public class BinaryTreeOperation {

    /**
     * Find Sum Of All Nodes, in the Range of L and R(inclusive)
     */
    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        dfs(root, L, R);
        return sum;
    }

    public void dfs(TreeNode root, int L, int R) {
        if (root != null) {
            if (root.val >= L && root.val <= R) {
                sum += root.val;
            }
            if (root.val > L) {
                dfs(root.left, L, R);
            }
            if (root.val < R) {
                dfs(root.right, L, R);
            }
        }
    }

    /**
     * Merge two Tree, If two value overlaps, new value of node will be the sum.
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    /**
     * Given an n-ary tree, return the preorder traversal of its nodes' values.
     */


/*    // Working Code of Pre-Order Traversal of n-Ary Tree
        public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }
    private void preorder(Node root, List<Integer> list) {

        if (root == null) return;
        list.add(root.val);
        List<Node> children = root.children;
        if(root.children != null){
            for (Node child : root.children){
                preorder(child, list);
            }
        }
    }*/
    public List<Integer> postorder(Node root) {
        List<Integer> alist = new ArrayList<>();
        postOrderTraversal(root, alist);
        return alist;
    }

    private void postOrderTraversal(Node root, List<Integer> alist) {
        if (root != null) {
            List<Node> children = root.children;
            if (children != null) {
                for (Node item : children) {
                    postOrderTraversal(item, alist);
                }
                alist.add(root.val);
            }
        }
    }

}
