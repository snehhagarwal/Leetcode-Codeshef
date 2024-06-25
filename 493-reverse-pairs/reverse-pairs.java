class Solution {
    static int count=0;
    public int reversePairs(int[] nums) {
        count=0;
        merge(nums,0,nums.length-1);
        return count;
    }
    public static int[] merge(int[] arr,int start,int end) {
        if (start == end) {
            int[] a = new int[1];
            a[0] = arr[start];
            return a;
        }
        int mid = start + (end - start )/ 2;
        int[] left = merge(arr, start, mid);
        int[] right = merge(arr, mid + 1, end);
        return mergedArray(left, right);
    }
    
    public static int[] mergedArray(int[] left,int[] right){
        int[] temp=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        int n=left.length;
        int m=right.length;
        counting(left,right);
        while(i<n && j<m){
            if(left[i]<=right[j]){
                temp[k]=left[i];
                i++;
                k++;
            }
            else{
                temp[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n){
            temp[k]=left[i];
            i++;
            k++;
        }
        while(j<m){
            temp[k]=right[j];
            k++;
            j++;
        }
        return temp;
    }
    public static void counting(int[] left,int[] right){
           int low=0;
           int high=0;
           while(low<left.length && high<right.length){
              if((long)left[low]>(long)2*right[high]){
                count+=left.length-low;
                high++;
               }
               else{
                low++;
            }
        }
    }
}
