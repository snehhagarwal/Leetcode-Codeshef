class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=0;i<nums1.length;i++){
        //      set.add(nums1[i]);
        // }
        // int min=Integer.MAX_VALUE;
        // for(int i:nums2){
        //     if(set.contains(i)){
        //         if(i<min){
        //             min=i;
        //         }
        //     }
        // }
        // if(min!=Integer.MAX_VALUE){
        //     return min;
        // }
        // return -1;
    }
}