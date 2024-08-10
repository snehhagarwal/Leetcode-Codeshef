class Solution {
    public long subArrayRanges(int[] nums) {
        long ans=0;
        long maximum=summax(nums);
        long minimum=summin(nums);
        return maximum-minimum;
    }
    public static long summax(int[] nums){
        int[] nge=ngefunc(nums);
        int[] pge=pgefunc(nums);
        long total=0;
        for(int i=0;i<nums.length;i++){
            int left=i-pge[i];
            int right=nge[i]-i;
            total=total+(left*right*1L*nums[i]);
        }
        return total;
    }

    public static int[] ngefunc(int[] arr){
        int[] nge=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=arr.length;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(i);
        }
        return nge;
    }
    public static int[] pgefunc(int[] arr){
        int[] pge=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pge[i]=-1;
            }else{
                pge[i]=st.peek();
            }
            st.push(i);
        }
        return pge;
    } 
    public static long summin(int[] arr){
        int[] nse=nsefunc(arr);
        int[] pse=psefunc(arr);
        long total=0;
        for(int i=0;i<arr.length;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            total=total+(left*right*1L*arr[i]);
        }
        return total;
    }
     public static int[] nsefunc(int[] arr){
        int[] nse=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=arr.length;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        return nse;
    }

    public static int[] psefunc(int[] arr){
        int[] pse=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        return pse;
    }
}