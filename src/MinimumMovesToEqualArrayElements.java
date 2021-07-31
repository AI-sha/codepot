import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {

 /*   public int minMoves(int[] nums) {    // time limit exceeds

        //n-1 elements increase by 1 i.e. all but the largest get increased. But if [2,3,3] then greater of the 2 index will not increase i.e. it becomes : [3,4,3]


            int max=nums.length-1;  // take last element index as the the index of largest element
            int min=0;            // first element as index of minimum element
            int cnt=0;
        for(;;){     // infinite loop
            for(int i=0; i<nums.length; i++){       //to find out index of max and min element
                if(nums[i]>nums[max]) max=i;
                if(nums[i]<nums[min]) min=i;
            }

            if(nums[max]==nums[min]) break;    //if min an dmax are equal, we have solved the problem

            for(int i=0; i<nums.length; i++){
                if(i!=max)         // i.e. not the index of largest element
                    nums[i]++;    // increament by 1
            }
            cnt++;
        }
        return cnt;

    }   */

        public int minMoves(int[] nums) {    //using sorting and moves formula
            Arrays.sort(nums);
            int count = 0;
            for (int i = nums.length - 1; i > 0; i--) {
                count += nums[i] - nums[0];
            }
            return count;
        }

}

/*
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
In one move, you can increment n - 1 elements of the array by 1.

Example :
Input: nums = [1,2,3]
Output: 3
Explanation: Only three moves are needed (remember each move increments two elements):
[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */