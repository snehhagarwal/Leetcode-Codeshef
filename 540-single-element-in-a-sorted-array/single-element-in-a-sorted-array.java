class Solution {
    public int singleNonDuplicate(int[] nums) {
        int no=0;
        for(int i=0;i<nums.length;i++){
             no=no^nums[i];
        }
        return no;
    }
}