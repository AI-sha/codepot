public class FindPeakElement {

    /*
    public int findPeakElement(int[] nums) {

        // Linear scan: O(n), O(1)
        // this will satisfy all cases where data is ASC, DESC or ASC+DESC
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])                 // we check if curr is greater than the next
                return i;
        }
        return nums.length - 1;                 // if not we will return the last element
    }
    */

        public int findPeakElement(int[] nums) {

            //Iterative Binary Search
            int l = 0, r = nums.length - 1;
            while (l < r) {
                int mid = l+(r-l) / 2;
                if (nums[mid] > nums[mid + 1])     // if so: means we are on a desc slope and we have to go left to find the peak, so we shift our window to the left side of mid
                    r = mid;
                else             // else means we are on ASC slope and we need to find the peak on the right side , so we shift our window to right
                    l = mid + 1;
            }
            return l;

        }

}

/*
A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
*/

