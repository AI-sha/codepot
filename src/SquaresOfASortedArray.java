public class SquaresOfASortedArray {

        public int[] sortedSquaresBrute(int[] nums) {

            for(int i=0; i<nums.length; i++){       // to store square values
                nums[i]=nums[i]*nums[i];
            }

            for(int j=0; j<nums.length-1; j++){       // to sort in ascending order
                int min=nums[j];
                int p=j;

                for(int k=j+1; k<nums.length; k++){

                    if(nums[k]<min){
                        min=nums[k];
                        p=k;
                    }
                }
                int swap=nums[j];     //swap to get the elements fixed one by one in the array in asc order
                nums[j]=min;
                nums[p]=swap;
            }
            return nums;
        }
    public int[] sortedSquares(int[] nums) {
        // two pointer method
        int l = 0;
        int r = nums.length-1;
        int sqArr[] = new int[nums.length];  // an array to store squared values
        int cntSq = nums.length-1;  // counter to decrease when highest valu stored at the last position

        if(l==r){                   // in case of only 1 element in array
            sqArr[cntSq]=nums[l]*nums[l];  // or nums[r]*nums[r]
        }
        else{
            for(int i=0; i<nums.length-1; i++){      //loop required to run only n-2 times so: <nums.length-1

                if(Math.abs(nums[l])>Math.abs(nums[r])){
                    sqArr[cntSq]=nums[l]*nums[l];
                    cntSq--;
                    l++;            //move the left value to next index
                    if(l==r){       // when we reach a point where l=r
                        sqArr[cntSq]=nums[l]*nums[l];
                        //break;
                    }
                }

                else{
                    sqArr[cntSq]=nums[r]*nums[r];
                    cntSq--;
                    r--;           // move the right value to just previous index
                    if(l==r){      // when we reach a point where l=r
                        sqArr[cntSq]=nums[r]*nums[r];
                        //break;
                    }
                }
            }

        }
        return sqArr;
    }

}

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/