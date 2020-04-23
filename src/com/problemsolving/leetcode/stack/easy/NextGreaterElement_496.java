package com.problemsolving.leetcode.stack.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 * Explanation:
 * For number 4 in the first array, you cannot find the next greater number for it in
 * the second array, so output -1.
 * For number 1 in the first array, the next greater number for it in the second array is 3.
 * For number 2 in the first array, there is no next greater number for it in the second array,
 * so output -1.
 */
public class NextGreaterElement_496 {
    public int[] nextGreaterElement(int[] findNum, int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[findNum.length];
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty() && st.peek() < nums[i]) {
                hmap.put(st.pop(), nums[i]);
            }
            st.push(nums[i]);
        }

        while (!st.isEmpty()) {
            hmap.put(st.pop(), -1);
        }

        for (int i = 0; i < findNum.length; i++) {
            arr[i] = hmap.get(findNum[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums1[] = new int[]{4, 1, 2};
        int nums2[] = new int[]{1, 3, 4, 2};
        NextGreaterElement_496 ob = new NextGreaterElement_496();
        System.out.println(Arrays.toString(ob.nextGreaterElement(nums1, nums2)));
    }
}
