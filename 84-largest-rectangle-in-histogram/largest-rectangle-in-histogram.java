class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int max=0;
        int nse=0;
        int pse=0;
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int ele=st.pop();
                nse=i;
                if(st.isEmpty()){
                    pse=-1;
                }else{
                    pse=st.peek();
                }
                int area=heights[ele]*(nse-pse-1);
                max=Math.max(max,area);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nse=heights.length;
            int ele=st.pop();
            if(st.isEmpty()){
                pse=-1;
            }else{
                pse=st.peek();
            }
            int area=heights[ele]*(nse-pse-1);
            max=Math.max(area,max);
        }
        return max;
    }
}
// int[] nse=nsefunc(heights);
//         int[] pse=psefunc(heights);
//         int max=0;
//         for(int i=0;i<heights.length;i++){
//             int area=heights[i]*(nse[i]-pse[i]-1);
//             max=Math.max(max,area);
//         }
//         return max;
//      }
//      public static int[] nsefunc(int[] arr){
//         int[] nse=new int[arr.length];
//         Stack<Integer> st=new Stack<>();
//         for(int i=arr.length-1;i>=0;i--){
//             while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
//                 st.pop();
//             }
//             if(st.isEmpty()){
//                 nse[i]=arr.length;
//             }
//             else{
//                 nse[i]=st.peek();
//             }
//             st.push(i);
//         }
//         return nse;
//     }
//     public static int[] psefunc(int[] arr){
//         int[] pse=new int[arr.length];
//         Stack<Integer> st=new Stack<>();
//         for(int i=0;i<arr.length;i++){
//             while(!st.isEmpty() && arr[st.peek()]>arr[i]){
//                 st.pop();
//             }
//             if(st.isEmpty()){
//                 pse[i]=-1;
//             }
//             else{
//                 pse[i]=st.peek();
//             }
//             st.push(i);
//         }
//         return pse;
//     }