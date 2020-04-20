package com.problemsolving.geeksforgeeks;

/**
 * Given an array A of N integers. The task is to find a peak element in it.
 * An array element is peak if it is not smaller than its neighbours.
 * For corner elements, we need to consider only one neighbour.
 */
public class FindPeakElements {
    public static void main(String[] args) {
        int arr[] = new int[]{988,857,744,492,228,366,860,937,433,552,438,229,276,408,475};
        System.out.println(peakElement(arr, arr.length));
    }

    public static int peakElement(int[] arr, int lb, int ub, int n) {
        int mid = (lb + ub) / 2;

        if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            return mid;
        } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return peakElement(arr, lb, mid - 1, n);
        } else{
            return peakElement(arr, mid + 1, ub, n);
        }
    }

    static int peakElement(int[] a,int n) {
        return peakElement(a, 0, n - 1, n);
    }
}
