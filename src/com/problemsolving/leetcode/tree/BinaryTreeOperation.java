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
/*
    // Working Code Of Post Order Traversal
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
    }*/

    // SearchBST using Recursion
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        return (root.val > val) ? searchBST(root.left, val) : searchBST(root.right, val);
    }

    // searchBST using Iteration
    public TreeNode searchBSTIterative(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = (root.val > val) ? root.left : root.right;
        }
        return root;
    }

    /**
     * arrange the tree in in-order so that the leftmost node in the tree
     * is now the root of the tree, and every
     * node has no left child and only 1 right child.
     */
    TreeNode curr;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        curr = ans;
        inOrder(root);
        return ans.right;
    }

    private void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            node.left = null;
            curr.right = node;
            curr = node;
            inOrder(node.right);
        }
    }

    /**
     * Maximum Depth of N-ary Tree
     */
/*
    // Working Code
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int curr = 0;
        for(Node child: root.children){
            curr = Math.max(curr,maxDepth(child));
        }
        return curr+1;
    }*/

    /**
     * A binary tree is univalued if every node in the tree has the same value.
     * Return true if and only if the given tree is univalued.
     * One solution is maintain an array, put all values of traversing node and in the end compare values.
     */
    public boolean isUnivalTree(TreeNode root) {
        boolean leftside = (root.left == null || (root.val == root.left.val && isUnivalTree(root.left)));
        boolean rightside = (root.right == null || (root.val == root.right.val && isUnivalTree(root.right)));
        return leftside && rightside;
    }

    /**
     * For all leaves in the tree, consider the numbers represented by the path from the root
     * to that leaf.
     * Return the sum of these numbers.
     */
    int totalSum;

    public int sumRootToLeaf(TreeNode root) {
        totalSum = 0;
        dfs(root, 0);
        return totalSum;
    }

    private void dfs(TreeNode root, int val) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                totalSum += (2 * val) + root.val;
            } else {
                int curr = (2 * val) + root.val;
                dfs(root.left, curr);
                dfs(root.right, curr);
            }
        }
    }

    /**
     * Max Depth Of a Binary Tree
     */
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
