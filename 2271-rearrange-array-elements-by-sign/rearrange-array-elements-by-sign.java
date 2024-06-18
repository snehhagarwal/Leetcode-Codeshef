class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posidx=0;
        int negidx=1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[posidx]=nums[i];
                posidx+=2;
            }
            else{
                arr[negidx]=nums[i];
                negidx+=2;
            }
        }
        return arr;
     }
}