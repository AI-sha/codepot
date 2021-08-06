public class SignOfTheProductOfAnArray {

        public int arraySign(int[] nums) {

            int signCnt=0;    //count number of negatives
            int zeroCheck=0;  // check if zero present in array
            int signFunc=0;   // store value to be returned
            for(int i=0; i<nums.length; i++){
                if(nums[i]<0) signCnt++;
                if(nums[i]==0){
                    zeroCheck++;
                    break;
                }
            }

            if(zeroCheck>0){     // if any zero present, return 0
                signFunc=0;
            }
            else{
                if(signCnt%2==0)   // if number of negatives are even then product will be positive
                    signFunc = 1;
                else if(signCnt%2!=0)  // if number of negatives are odd then product will be negative
                    signFunc = -1;
            }

            return signFunc;
        }
}

/*
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).



Example 1:

Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
*/

