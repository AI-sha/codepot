public class KthMissingPositiveInteger {

    //Brute force
        public int findKthPositive(int[] arr, int k) {

            int val=1;     //to track positive integers
            int cnt=0;      // to count till kth integer
            int missInt=0;  // to store return value
            for(int i=0; i<arr.length; i++){
                if(arr[i]==val){         // if integer not missing
                    val++;
                }
                else{                   // if integer missing
                    val++;
                    cnt++;
                    i--;     // so as to remain on the current value as it did not match val
                }

                if(cnt==k){
                    missInt=val-1;   // since val has been ++ above
                    break;
                }

                if(i==arr.length-1 && cnt!=k){         // if we reached end index and still not at kth, then add (k-cnt) in last number
                    missInt=arr[arr.length-1]+(k-cnt);
                }
            }
            return missInt;

        }
}

/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Find the kth positive integer that is missing from this array.



Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
*/

