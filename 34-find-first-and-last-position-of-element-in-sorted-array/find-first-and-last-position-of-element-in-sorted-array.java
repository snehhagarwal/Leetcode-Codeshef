class Solution {
    public int[] searchRange(int[] nums, int target) {
        int  first=firstidx(nums,target);
        if(first==-1){
            return new int[]{-1,-1};
        }
        int last=lastidx(nums,target);
        return new int[]{first,last};
    }
    public static int firstidx(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        int f=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                f=mid;
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }else{
                high =mid-1;
            }
        }
        return f;
    }

    public static int lastidx(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        int l=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                l=mid;
                low=mid+1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return l;
    }
}