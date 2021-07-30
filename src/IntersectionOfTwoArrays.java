public class IntersectionOfTwoArrays {

        public int[] intersection(int[] nums1, int[] nums2) {

            int minlength = Math.min(nums1.length,nums2.length);
            int IntArr[] = new int[minlength];

            for(int i=0; i<nums1.length; i++){
                for(int j=0; j<nums2.length; j++){

                    if(i==0){
                        if(nums1[i]==nums2[j]){
                            IntArr[i] = nums1[i];
                            break;
                        }
                    }
                    else{
                        if(nums1[i]==nums2[j] && nums1[i]!=nums1[i-1]){
                            IntArr[i] = nums1[i];
                            break;
                        }
                    }

                }
            }
            return IntArr;
        }
}

//size of the output array ?

