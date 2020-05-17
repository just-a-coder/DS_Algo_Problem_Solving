/*
package com.problemsolving.leetcode.graph;

import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


public class MaximumDepthOfNaryTree_559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
       return findMaxDepth(root,1,null);
    }

    public int findMaxDepth(Node root, int depth, Node parent) {
        if (root == null) {
            return 0;
        }
        for (Node node : root.children) {
            if()
            depth = Math.max(depth, findMaxDepth(node,depth,root));
        }
        return depth+1;
    }

    public static void main(String[] args) {

    }
}
*/
