package com.problemsolving.challenge_contests.template;

public class Swapping {

    // Swapping Two Places in an Array
    private static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
