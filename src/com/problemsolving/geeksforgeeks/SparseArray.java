package com.problemsolving.geeksforgeeks;

public class SparseArray {
    public static int findSparseArray(String arr[], String k) {
        int n = arr.length, mid, res = -1;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;

            /* If mid is empty, find closest non-empty string. */
            if(arr[mid].isEmpty())
                mid = findMid(arr,mid,start,end);

            if (arr[mid].equals(k))
                return mid;
            else if (arr[mid].compareTo(k)>0) {
                end = mid - 1;
            } else if (arr[mid].compareTo(k)<0) {
                start = mid + 1;
            }
        }
        return res;
    }

    private static int findMid(String[] arr, int mid, int start, int end) {
        int left = mid - 1;
        int right = mid + 1;
        while (true) {
            if (left < start && right > end) {
                return -1;
            }
            if (left >= start && !arr[left].isEmpty()) {
                mid = left;
                break;
            }
            if (right <= end && !arr[right].isEmpty()) {
                mid = right;
                break;
            }
            left--;
            right++;
        }
        return mid;
    }

    public static void main(String[] args) {
        String arr[] = new String[]{"apple", "", "", "banana", "", "", "", "carrot", "duck", "", "", "eel", "", "flower"};
        String k = "duck";
        System.out.println(findSparseArray(arr, k));
    }
}
