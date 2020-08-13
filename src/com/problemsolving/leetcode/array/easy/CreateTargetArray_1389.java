package com.problemsolving.leetcode.array.easy;

public class CreateTargetArray_1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {

        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            int idx = index[i];

            if(idx < i)
            {
                for(int j = i; j > idx; j--)
                    res[j] = res[j-1];
            }

            res[idx] = nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{0,1,2,3,4};
        int index[] = new int[]{0,1,2,2,1};
        System.out.println(createTargetArray(nums, index));
    }
}
