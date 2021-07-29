public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = 0; int p2 = 0; // counter for nums1_co and nums2
        int[] nums1_co = new int[m];
        for(int i = 0; i < m; i++)
        {
            nums1_co[i]=nums1[i];
        }

        int p = 0; // counter for nums1

        while ((p1 < m) && (p2 < n))
        {
            if(nums1_co[p1]<nums2[p2])
                nums1[p++]=nums1_co[p1++];
            else
                nums1[p++]=nums2[p2++];
        }

        if(p1<m) // to copy elements that are left from any of the array.
        {
            for(int i = p; i < m+n; i ++)
            {
                nums1[i] = nums1_co[p1++];
            }
        }
        else if(p2<n)
        {
            for(int i = p; i < m+n; i ++)
            {
                nums1[i] = nums2[p2++];
            }
        }



    }
}

// this is using three pointers

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/