class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
             set.add(nums1[i]);
        }
        int min=Integer.MAX_VALUE;
        for(int i:nums2){
            if(set.contains(i)){
                if(i<min){
                    min=i;
                }
            }
        }
        if(min!=Integer.MAX_VALUE){
            return min;
        }
        return -1;
    }
}