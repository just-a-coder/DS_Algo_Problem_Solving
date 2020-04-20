package com.problemsolving.leetcode.binarysearch.easy;

/**
 * letters = ["c", "f", "j"]
 * target = "d"
 * Output: "f"
 */
public class FindSmallestLetterGreaterThanTarget_744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        // If Nothing matches then first element will be the answer.
        char res = letters[0];
        int n = letters.length, start = 0, end = n - 1, mid;
        while (start <= end && start >= 0 && end <= n - 1) {
            mid = start + (end - start) / 2;
            if (letters[mid] == target) {
                start = mid + 1;
                if (start > n-1) {
                    return letters[0];
                }
            } else if (letters[mid] > target) {
                res = letters[mid];
                end = mid - 1;
            } else if (letters[mid] < target) {
                start = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'c', 'f', 'j'};
        char target = 'k';
        System.out.println(nextGreatestLetter(arr, target));
    }
}
