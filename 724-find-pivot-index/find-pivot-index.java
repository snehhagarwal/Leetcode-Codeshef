class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0;
        int tsum=0;
        for(int i:nums){
            tsum+=i;
        }
        for(int i=0;i<nums.length;i++){
            int rsum=tsum-lsum-nums[i];
            if(rsum==lsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}