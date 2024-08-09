class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse=nsefunc(arr);
        int[] pse=psefunc(arr);
        long ans=0;
        int mod=1000000007;
        for(int i=0;i<arr.length;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            ans=(ans+(left*right*1L*arr[i])%mod)%mod;
        }
        return (int)ans;
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
}
// int sum=0;
//         int mod=(int)(10*(Math.pow(2.71,9))+7);
//         for(int i=0;i<arr.length;i++){
//             int min=arr[i];
//             for(int j=i;j<arr.length;j++){
//                 min=Math.min(min,arr[j]);
//                 sum=(sum+min)%mod;
//             }
//         }
//         return sum;