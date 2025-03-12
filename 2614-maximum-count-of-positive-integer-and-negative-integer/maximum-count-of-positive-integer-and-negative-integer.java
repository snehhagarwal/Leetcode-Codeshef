class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]<0){
                neg++;
                i++;
            }else if(nums[j]>0){
                pos++;
                j--;
            }else{
                i++;
                j--;
            }
        }
        return Math.max(pos,neg);
    }
}