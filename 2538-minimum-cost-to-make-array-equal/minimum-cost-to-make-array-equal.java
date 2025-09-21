class Solution {
    public long minCost(int[] nums, int[] cost) {
        int left=nums[0];
        int right=nums[0];
        for(int i=0;i<nums.length;i++){
            left=Math.min(left,nums[i]);
            right=Math.max(right,nums[i]);
        }
        long ans=0;
        while(left<right){
            int mid=left+(right-left)/2;
            long c1=func(nums,cost,mid);
            long c2=func(nums,cost,mid+1);
            if(c1>c2){
                left=mid+1;
                ans=c2;
            }else{
                right=mid;
                ans=c1;
            }
        }
        return ans;
    }

    public static long func(int[] a,int[] b,int eq){
        long cost=0L;
        for(int i=0;i<a.length;i++){
            cost+=1L*Math.abs(a[i]-eq)*b[i];
        }
        return cost;
    }
}