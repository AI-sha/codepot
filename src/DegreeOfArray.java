import java.util.*;

public class DegreeOfArray {

        public int findShortestSubArray(int[] nums) {

            Map<Integer, Integer> left =  new HashMap(); // stores index of first occurrence of each element
            Map<Integer, Integer> right = new HashMap(); // stores index of last occurrence of each element
            Map<Integer, Integer> count = new HashMap(); // stores count of each element



/* Map<Integer, Integer> left = new HashMap(),
            right = new HashMap(), count = new HashMap();        */

            for(int i = 0; i < nums.length; i++)
            {
                // loop to check for each element of array

                if(left.get(nums[i]) == null)
                    left.put(nums[i],i);            // the first occurrence will be stored only if the map does not already have the value

                right.put(nums[i],i);
                count.put(nums[i], count.getOrDefault(nums[i],0) + 1);

            }

            int len = nums.length;
            int deg = Collections.max(count.values());

            for(int i : count.keySet())  // loop for each key of the count map
            {
                if(count.get(i) == deg)
                    len = Math.min(len, right.get(i)- left.get(i) + 1);  // Math.min is to accomodate [1,3,2,2,3,1]
            }

            return len;
        }
    }

/*
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
*/

