package com.problemsolving.leetcode.binarysearch.easy;

public class MajorityElementInAnArray_1150 {

    public static boolean isMajorityElement(int arr[], int k) {
        int n = arr.length;
        int lowIndex = findFirstElementOfArray(arr, n, k);
        int highIndex = findlastElementOfArray(arr, n, k);
        if ((highIndex != -1) && (highIndex - lowIndex + 1) > n / 2)
            return true;
        else
            return false;
    }

    private static int findFirstElementOfArray(int[] arr, int n, int k) {
        int start = 0, end = n - 1, mid;
        int index = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                index = mid;
                end = mid - 1;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else if (arr[mid] < k) {
                start = mid + 1;
            }
        }
        return index;
    }

    private static int findlastElementOfArray(int[] arr, int n, int k) {
        int start = 0, end = n - 1, mid;
        int index = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                index = mid;
                start = mid + 1;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else if (arr[mid] < k) {
                start = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{438885258};
        int k = 786460391;
        System.out.println(isMajorityElement(arr, k));
    }
}
