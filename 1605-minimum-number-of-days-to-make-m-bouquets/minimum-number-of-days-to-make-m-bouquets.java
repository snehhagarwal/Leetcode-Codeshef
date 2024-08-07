class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=minele(bloomDay);
        int high=maxele(bloomDay);
        int ans=-1;
        if(bloomDay.length<m*k){
            return -1;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(days(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int minele(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
    public static int maxele(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public static boolean days(int[] arr,int mid,int m,int k){
        int count=0;
        int no=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                no+=count/k;
                count=0;
            }
        }
        no+=count/k;
        if(no>=m){
            return true;
        }
        else{
            return false;
        }
    }
}