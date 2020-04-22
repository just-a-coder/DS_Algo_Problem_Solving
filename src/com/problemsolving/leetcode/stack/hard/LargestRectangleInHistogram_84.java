package com.problemsolving.leetcode.stack.hard;

import java.util.Stack;

/**
 * Input: [2,1,5,6,2,3]
 * Output: 10
 */
public class LargestRectangleInHistogram_84 {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int area = 0, maxarea = 0, i = 0;
        Stack<Integer> st = new Stack<>();
        while (i < n) {
            if (st.isEmpty() || heights[st.peek()] <= heights[i]) {
                st.push(i++);
            } else {
                int top = st.peek();
                st.pop();
                if (st.isEmpty()) {
                    area = heights[top] * i;
                } else {
                    area = heights[top] * (i-st.peek()-1);
                }
            }
            maxarea = Math.max(maxarea,area);
        }
        while (!st.isEmpty()) {
            int top = st.peek();
            st.pop();
            if (st.isEmpty()) {
                area = heights[top] * i;
            } else {
                area = heights[top] * (i-st.peek()-1);
            }
            maxarea = Math.max(maxarea,area);
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}
