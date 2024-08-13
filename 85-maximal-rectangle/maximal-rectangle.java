class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int sum=0;
        int[][] p=new int[n][m];
        for(int j=0;j<m;j++){
            sum=0;
            for(int i=0;i<n;i++){
                sum+=matrix[i][j]-'0';
                if(matrix[i][j]=='0'){
                    sum=0;
                }
                p[i][j]+=sum;
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
             max=Math.max(max,func(p[i]));
        }
        return max;
    }

    public static int func(int[] arr){
        Stack<Integer> st=new Stack<>();
        int ns=0;
        int ps=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int ele=st.pop();
                ns=i;
                if(st.isEmpty()){
                    ps=-1;
                }else{
                    ps=st.peek();
                }
                int area=arr[ele]*(ns-ps-1);
                max=Math.max(area,max);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int ele=st.pop();
            ns=arr.length;
            if(st.isEmpty()){
                ps=-1;
            }
            else{
                ps=st.peek();
            }
            int area=arr[ele]*(ns-ps-1);
            max=Math.max(area,max);
        }
        return max;
    }
}