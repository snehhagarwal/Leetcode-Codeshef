class StockSpanner {
    Stack<int[]> st;
    int idx;
    public StockSpanner() {
         st=new Stack<>();
         idx=0;
    }
    
    public int next(int price) {
        int cnt=1;
        while(!st.isEmpty() && st.peek()[0]<=price){
            st.pop();
        }
        if(st.isEmpty()){
            cnt=idx-(-1);
        }else{
            cnt=idx-st.peek()[1];
        }
        st.push(new int[]{price,idx});
        idx++;
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */