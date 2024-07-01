class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int m=nums1.length;
        int n=nums2.length;
        int low=0;
        int high=nums1.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            int py=(m+n+1)/2-mid;
            int x1= mid==0? Integer.MIN_VALUE:nums1[mid-1];
            int x2= py==0 ? Integer.MIN_VALUE:nums2[py-1];
            int x3= mid==m?Integer.MAX_VALUE:nums1[mid];
            int x4= py==n? Integer.MAX_VALUE:nums2[py];
            if(x1<=x4 && x2<=x3){
                if((m+n)%2==1){
                    return Math.max(x1,x2);
                }
                else{
                    return (Math.max(x1,x2)+Math.min(x3,x4))/2.0;
                }
            }
            if(x1>x4){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1.0;
    }
}