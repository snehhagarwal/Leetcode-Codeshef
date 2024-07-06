class Solution {
    public int longestOnes(int[] nums, int k) {
        //brute force
        // int max=0;
        // for(int j=0;j<nums.length;j++){
        //    int cnt=0;
        //    for(int i=j;i<nums.length;i++){
        //     if(nums[i]==0){
        //         cnt++;
        //     }
        //     if(cnt<=k){
        //         max=Math.max(max,i-j+1);
        //     }else{
        //         break;
        //     }
        // }
        // }
        // return max;
        int i=0;
        int j=0;
        int max=0;
        int cnt=0;
        while(j<nums.length){
            if(nums[j]==0){
                cnt++;
            }
            if(cnt>k){
                if(nums[i]==0){
                    cnt--;
                }
                i++;
            }
            if(cnt<=k){
                 max=Math.max(max,j-i+1);
            }
            j++;
        }
        return max;
    }
}