package com.problemsolving.leetcode.graph;

/**
 * Example 1:
 * Input: [[1,1],2,[1,1]]
 * Output: 10
 * Explanation: Four 1's at depth 2, one 2 at depth 1.
 *
 * Example 2:
 * Input: [1,[4,[6]]]
 * Output: 27
 * Explanation: One 1 at depth 1, one 4 at depth 2, and one 6 at depth 3; 1 + 4*2 + 6*3 = 27.
 */
// Working Code
/*public class DepthSum_339 {
    public int depthSum(List<NestedInteger> nestedList) {
        if(nestedList.size() == 0)
            return 0;
        int depth = 1;
        int result = 0;
        return findDepth(nestedList,depth);
    }

    public int findDepth(List<NestedInteger> nestedList, int depth) {
        int result = 0;

        for (NestedInteger ni : nestedList) {
            if (ni.isInteger()) {
                result += depth * ni.getInteger();
            }else{
                result += findDepth(ni.getList(), depth + 1);
            }
        }
        return result;
    }
}*/
