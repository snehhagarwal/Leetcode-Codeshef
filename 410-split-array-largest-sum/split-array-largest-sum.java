class Solution {
    public int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }
        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(part(nums,mid)<=k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int part(int[] arr,int sum){
        int p=1;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            if(sum2+arr[i]<=sum){
                sum2+=arr[i];
            }else{
                p++;
                sum2=arr[i];
            }
        }
        return p;
    }
}