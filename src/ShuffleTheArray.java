public class ShuffleTheArray {

        public int[] shuffle(int[] nums, int n) {

            int newNums[] = new int[nums.length];
            int pos=n;     // to mark the nth positon and then increament by 1 in loop
            int start=0;   // to mark start of new array
            for(int i=0; i<n; i++){
                newNums[start] = nums[i];
                newNums[start+1] = nums[pos];
                start=start+2;
                pos++;
            }
            return newNums;
        }
}

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].



Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/

