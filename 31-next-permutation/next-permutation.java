class Solution {
    public void nextPermutation(int[] nums) {
        int bp=-1;
        //see the breaking point
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                bp=i;
                break;
            }
        }
        if(bp==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        else{
            //second large element after breaking point
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[bp]){
                    int temp=nums[i];
                    nums[i]=nums[bp];
                    nums[bp]=temp;
                    break;
                }
            }
        }
        reverse(nums,bp+1,nums.length-1);
        return;
    }
    public static void reverse(int[] arr,int a,int b){
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
}