public class MajorityElement {
        public int majorityElementBrute(int[] nums) {

            int cnt, majCnt = nums.length/2, majElem = nums[0];

            for(int i = 0; i < nums.length; i++)
            {
                cnt = 1;

                for(int j = i+1; j < nums.length; j++)
                {
                    if(nums[i] == nums[j])
                        cnt++;

                }


                if(cnt > majCnt)
                    majElem = nums[i];

            }

            return majElem;
        }
}

 /* Given an array nums of size n, return the majority element.
 The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
 always exists in the array.
 */