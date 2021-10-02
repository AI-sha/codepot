public class FindTheDuplicateNumber {
    /*
        public int findDuplicate(int[] nums) {

            // Aproach 1: Sort the array, check if value at i is equal to value at i-1, if so, duplicate found

            // Using Binary search:

            int left=1;
            int right=nums.length-1;
            int duplicate = -1;

            while(left<=right)
            {
                int val=left + (right-left)/2;

                int count=0;
                for(int i=0; i<nums.length; i++){
                    if(nums[i]<=val){
                        count++;
                    }
                }

                if(count>val){
                    duplicate=val;
                    right=val-1;   //to find is a smaller duplicate number exists  // but question says that we have only 1 duplicate.?
                }
                else{
                    left=val+1;
                }
            }
            return duplicate;

        }
}

/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
*/

// Binary Search with for-each loop:

    public int findDuplicate(int[] nums) {
        int left = 0, right = nums.length;

        while(left<right){
            int mid = left + (right-left)/2;
            int count = 0;

            for(int i:nums)
                if(i<=mid)     // to check for numbers less than the mid value selected
                {
                    count++;
                }


            if(count > mid){       // if the number of integers that are "less than or equal to the number" are more than the number itself
                right = mid;       // shifting the search window to left side of mid, as duplicate will be found there
            }else{
                left = mid+1;     // shifting the search window to right side of mid, as duplicate will be found there
            }
        }
        return left;
    }
}
