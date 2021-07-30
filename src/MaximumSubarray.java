public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];  // first element
        int val = nums[0];
        for(int i = 1; i< nums.length;i++)
        {
            if(nums[i]>nums[i]+val)   // check if adding an element to the subarray increases or decreases value and assign in max accordingly
                val = nums[i];
            else
                val = nums[i]+val;

            if(val>max)
                max = val;
        }

        return max;
    }
}  // this is dynamic programming, Kadane's Algo

/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.
*/