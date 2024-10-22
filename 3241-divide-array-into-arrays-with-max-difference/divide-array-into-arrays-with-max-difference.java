class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans=new int[nums.length/3][3];
        int idx=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=3){
            int f=nums[i];
            int s=nums[i+1];
            int t=nums[i+2];
            if(t-f<=k){
                ans[idx][0]=f;
                ans[idx][1]=s;
                ans[idx][2]=t;
                idx++;
            }else{
                return new int[0][0];
            }
        }
        return ans;
    }
}