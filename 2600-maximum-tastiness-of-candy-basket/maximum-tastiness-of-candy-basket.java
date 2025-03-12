class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int ans=-1;
        int i=0;
        int j=price[price.length-1];
        while(i<=j){
            int mid=i+(j-i)/2;
            if(func(mid,price,k)){
                ans=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }

    public static boolean func(int mid,int[] arr,int k){
        int c=1;
        int ele=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-ele>=mid){
                c++;
                ele=arr[i];
                if(c==k){
                    return true;
                }
            }
        }
        return false;
    }
}