public class MaxProductOfThreeNumbers {

        public int maximumProduct(int[] nums) {
            int t=0;
            for(int i=0; i<nums.length-1; i++){       // this will order the array in decreasing order
                int max=nums[i];int p=i;
                for(int j=i+1; j<nums.length; j++){
                    if(max<nums[j]){
                        max=nums[j];
                        p=j;
                    }
                }
                t=nums[i];
                nums[i]=max;
                nums[p]=t;
            }

            // below statement returns either product of first three greatest postive elements in the array. OR product of first and last 2 negative elements if larger than the prev product
            return Math.max(nums[0] * nums[1] * nums[2], nums[nums.length - 1] * nums[nums.length - 2] * nums[0]);

        }
}

/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
Example 1:

Input: nums = [1,2,3]
Output: 6


[-98,4,3,2,1,-100]
39200
*/

