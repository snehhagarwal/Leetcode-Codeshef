class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean onepresent =false;
        for(int i=0;i<nums.length;i++){
               if(nums[i]<1 || nums[i]>nums.length){
                 nums[i]=1;
               }else if(nums[i]==1){
                  onepresent=true;
               }
        }
        if(!onepresent){
            return 1;
        }
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int index=Math.abs(ele)-1;
            if(nums[index]>0){
                nums[index]=-1*nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
               return i+1;
            }
        }
        return n+1;
    }
}