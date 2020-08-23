package com.problemsolving.leetcode.array.easy;

import java.util.Arrays;
import java.util.TreeSet;

public class FindTheDistanceValueBetweenTwoArrays_1385 {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = 0, diff = 0;
        TreeSet<Integer> tset = new TreeSet<>();
        Arrays.stream(arr2).forEach(i -> tset.add(i));
        for(int n : arr1){
            Integer fl = tset.floor(n);
            Integer ceil = tset.ceiling(n);
            if(fl == null){
                diff = ceil - n;
            }else if (ceil == null){
                diff = n - fl;
            }else{
                diff = Math.min(ceil - n,n - fl);
            }
            if(diff <= d) result++;
        }
        return result;
    }


/*    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean search = binarySearch(arr2, arr1[i]-d, arr1[i]+d);
            if(search){
                result++;
            }
        }
        return result;
    }*/

    private static boolean binarySearch(int arr[], int from, int to) {
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= from && arr[mid] <= to){
                return false;
            }else if(arr[mid] < from){
                low = mid + 1;
            }else if(arr[mid] > to){
                high = mid - 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1,4,2,3};
        int arr2[] = new int[]{-4,-3,6,10,20,30};
        int d = 3;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }
}
