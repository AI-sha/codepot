public class TwoSumIIInputArrayisSorted {
        public int[] twoSum(int[] numbers, int target) {


            // O(n2) solution:

            int arr[] = new int[2];    // to store output values
            for(int i=0; i<numbers.length; i++){
                for(int j=i+1; j<numbers.length; j++){
                    if(target-numbers[i]==numbers[j]){
                        arr[0]=i+1; arr[1]=j+1;              // adding one as it is 1-indexed array
                        break;
                    }
                }
            }
            return arr;
        }
}

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= first < second <= numbers.length.

Return the indices of the two numbers, index1 and index2, as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

*/


