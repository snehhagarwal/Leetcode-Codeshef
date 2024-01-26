class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int e:weights){
            low=Math.max(low,e);
            high+=e;
        }
        while(low<=high){
        int mid=low+(high-low)/2;
        int numdays=daycount(weights,mid);
        if(numdays<=days){
            high=mid-1;
        }else{
            low=mid+1;
        }
        }return low;
    }
    public int daycount(int[] weights,int cap){
        int load=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
        if(load+weights[i]>cap){
            day+=1;
            load=weights[i];
        }else{
            load+=weights[i];
        }
    }return day;
}
}