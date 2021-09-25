public class FindFirstAndLastPositionOfElementInSortedArray {
        public int[] searchRange(int[] nums, int target) {

            int firstOccurrence = this.findBound(nums, target, true);

            if (firstOccurrence == -1) {
                return new int[]{-1, -1};
            }

            int lastOccurrence = this.findBound(nums, target, false);

            return new int[]{firstOccurrence, lastOccurrence};        // output returned
        }

        private int findBound(int[] nums, int target, boolean isFirst) {
            int N = nums.length;
            int begin = 0, end = N - 1;

            while (begin <= end) {            // condition for binary search continuation

                int mid = (begin + end) / 2;

                if (nums[mid] == target) {

                    if (isFirst) {

                        // This means we found our lower bound.
                        if (mid == begin || nums[mid - 1] != target) {      // 2, 7 (mid - 1), 7 (mid), 7, 8, 10
                            return mid;
                        }

                        // Search on the left side for the bound.
                        end = mid - 1;

                    } else {

                        // This means we found our upper bound.
                        if (mid == end || nums[mid + 1] != target) {
                            return mid;
                        }

                        // Search on the right side for the bound.
                        begin = mid + 1;
                    }

                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
            }

            return -1;
        }
}

/*

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

*/

