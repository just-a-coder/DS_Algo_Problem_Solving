package com.problemsolving.leetcode.binarysearch.medium;

/**
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 */
public class SearchInARotatedSortedArray {
    public static int search(int[] arr, int k) {
        int start = 0, n = arr.length, end = n - 1, minIndex = -1, res = -1;
        minIndex = findMinElement(arr);
        // For Edge Case {} empty array
        if (minIndex == -1) {
            return res;
        }
        if (arr[minIndex] <= k && arr[n - 1] >= k) {
            start = minIndex;
            end = n - 1;
        } else {
            start = 0;
            end = minIndex - 1;
        }
        res = binarySearch(arr,k,start,end);
        return res;
    }

    public static int binarySearch(int arr[], int k, int start, int end) {
        int mid;
        while (start <= end) {
            mid = start + (end-start)/2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                end = mid -1;
            } else if (arr[mid] < k) {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int findMinElement(int[] arr) {
        int start = 0, n = arr.length, end = n - 1, mid, minIndex = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                minIndex = mid;
                break;
            }
            if (arr[mid] >= arr[next]) {
                minIndex = next;
                break;
            }
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if (arr[mid] <= arr[end]) {
                end = mid + 1;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{};
        int k = 2;
        System.out.println(search(arr, k));
    }
}
