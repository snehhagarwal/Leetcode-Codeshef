class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int rain=0;
        int lmax=0;
        int rmax=0;
        while(l<=r){
            if(lmax<=rmax){
                if(height[l]<lmax){
                    rain+=lmax-height[l];
                }else{
                    lmax=height[l];
                }
                l++;
            }
            else{
                if(height[r]<rmax){
                    rain+=rmax-height[r];
                  }else{
                    rmax=height[r];
                }
                r--;
            }
        }
        return rain;
    }
}
// int[] prefix=prefunc(height);
//         int[] suffix=suffunc(height);
//         int sum=0;
//         for(int i=0;i<height.length;i++){
//             sum=sum+(Math.min(prefix[i],suffix[i])-height[i]);
//         }
//         return sum;
//     }

//     public static int[] prefunc(int[] arr){
//         int[] pre=new int[arr.length];
//         pre[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             pre[i]=Math.max(pre[i-1],arr[i]);
//         }
//         return pre;
//     }

//     public static int[] suffunc(int[] arr){
//         int[] suf=new int[arr.length];
//         suf[arr.length-1]=arr[arr.length-1];
//         for(int i=arr.length-2;i>=0;i--){
//             suf[i]=Math.max(arr[i],suf[i+1]);
//         }
//         return suf;