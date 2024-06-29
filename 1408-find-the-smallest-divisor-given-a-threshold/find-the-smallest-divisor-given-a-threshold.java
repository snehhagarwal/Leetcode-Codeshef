class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
             int mid=low+(high-low)/2;
             if(sum(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
             }else{
                low=mid+1;
             }
        }
        return ans;
    }
    public static int sum(int[] nums,int mid){
        int no=0;
        for(int i=0;i<nums.length;i++){
            no+=Math.ceil((double)nums[i]/(double)mid);
        }
        return no;
    }
}