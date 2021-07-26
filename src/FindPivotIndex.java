public class FindPivotIndex {

        public int pivotIndexBrute(int[] nums) {


            int ind = 0; //indicator if pivot index found
            int piv_ind = 0;
            for(int i = 0; i < nums.length; i++)
            {
                int bck_sum = 0, fwd_sum = 0;
                for(int j = i+1; j < nums.length; j++)  // to sum right numbers
                {
                    fwd_sum = fwd_sum + nums[j];
                }

                for(int j = i-1; j >= 0; j--)  // to sum left numbers
                {
                    bck_sum = bck_sum + nums[j];
                }

                if(fwd_sum == bck_sum)
                {
                    ind = 1; piv_ind = i;
                    break;   // breaking from the loop the moment we get first pivot index
                }

            }

            if(ind == 1)
                return piv_ind;
            else
                return -1;
        }
}

/*  special case : [-1,-1,0,0,-1,-1] : the output should be 2 and not 3. (break statement handles this)
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
*/


