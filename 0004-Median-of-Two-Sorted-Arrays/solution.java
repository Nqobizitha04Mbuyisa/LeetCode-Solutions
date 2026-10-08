class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int size = nums1.length + nums2.length;;

        if(nums1.length != 0 && nums2.length != 0){
            System.out.println("The Median is : "+ (size / 2));
        }
        else{
            System.out.println("Invalid");
        }
        return size;
    }
}