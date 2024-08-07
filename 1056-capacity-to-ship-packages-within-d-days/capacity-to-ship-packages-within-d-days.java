class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(weights[i],max);
            sum+=weights[i];
        }
        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high){
                int mid=low+(high-low)/2;
                if(dayscal(weights,mid)<=days){
                    ans=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
        }
        return ans;
    }
    public static int dayscal(int[] weights,int mid){
        int d=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                d++;
                load=weights[i];
            }
            else{
                load=load+weights[i];
            }
        }
        return d;
    }
}