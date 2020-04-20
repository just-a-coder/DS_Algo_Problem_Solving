package com.problemsolving.leetcode.binarysearch.medium;

/**
 * Input: array = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 */
public class SearchInaSortedArrayOfUnknownSize {
    public int search(Reader reader, int k) {
        int start = 0, end = 1, mid;
        while (k > reader.get(end)) {
            start = end;
            end = 2 * end;
        }
        while (start <= end) {
            mid = start + (end - start) / 2;
            int val = reader.get(mid);
            if (val == k) {
                return mid;
            } else if (val > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

class Reader {
    // Sample Method for interface
    public static int get(int index) {
        return 1;
    }
}

/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 * public int get(int index) {}
 * }
 */
