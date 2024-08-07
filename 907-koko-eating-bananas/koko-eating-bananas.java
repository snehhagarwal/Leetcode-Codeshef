class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxele(piles);
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(totalhours(piles,mid)<=h){
                    ans=mid;
                    //low=mid+1;
                    high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int maxele(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public static int totalhours(int[] arr,int hour){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/(double)hour);
        }
        return sum;
    }
}