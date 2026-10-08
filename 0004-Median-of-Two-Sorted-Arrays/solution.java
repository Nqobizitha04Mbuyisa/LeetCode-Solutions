class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
       int size = nums1.length + nums2.length;

        int[] merged = new int[size];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }

            k++;
        }

        while (i < nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        if (size % 2 == 1) {
            return merged[size / 2];
        } else {
            return (merged[size / 2 - 1] + merged[size / 2]) / 2.0;
        }
    }
}