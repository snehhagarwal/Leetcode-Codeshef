class Solution {
    public int thirdMax(int[] arr) {
        long max=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long thirdmax=Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                thirdmax=smax;
                smax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>smax){
                thirdmax=smax;
                smax=arr[i];
            }
            else if(arr[i]<smax && arr[i]>thirdmax){
                thirdmax=arr[i];
            }
        }
        if(thirdmax==Long.MIN_VALUE){
            return (int)max;
        }
        return (int)thirdmax;
    }
}