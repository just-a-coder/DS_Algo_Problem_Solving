package com.problemsolving.leetcode.twopointer;

public class ContainerWithMostWater_11 {

    public int maxArea(int[] height) {
        int len = height.length;
        if(len < 2) return 0;
        int low = 0, hi = len -1, result = 0;
        while(low < hi){
            int lowmax = height[low], himax = height[hi];
            int candidate = (hi - low) * Math.min(lowmax, himax);
            result = Math.max(candidate, result);

            if(height[low] <= height[hi]){
                while(low<len-1 && height[low]<= lowmax) low++;
            }else{
                while(hi>0 && height[hi]<= himax) hi--;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        ContainerWithMostWater_11 q = new ContainerWithMostWater_11();

        int[] height = {5,2,12,1,5,3,4,11,9,4};

        int res = q.maxArea(height);

        System.out.println(res);
    }
}
