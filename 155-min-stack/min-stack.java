class MinStack {
    Stack<Long> st=new Stack<>();
    public MinStack() {
    }
    public long min=Long.MAX_VALUE;
    
    public void push(long val) {
        if(st.isEmpty()){
           st.push(val);
           min=val;
        }
        else{
            if(val<min){
            st.push(2*val-min);
            min=val;
            }
            else{
                st.push(val);
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        long x=st.peek();
        st.pop();
        if(x<min){
            min=(2*min)-x;
        }
    }
    
    public long top() {
        long p=st.peek();
        if(min<p){
            return p;
        }
        return min;
    }
    
    public long getMin() {
        return min;
    }
}
// Stack<Integer> st=new Stack<>();
//     Stack<Integer> minstack=new Stack<>();
//     public MinStack() {
        
//     }
    
//     public void push(int val) {
//         st.push(val);
//         if(minstack.isEmpty() || val<=minstack.peek()){
//             minstack.push(val);
//         }
//     }
    
//     public void pop() {
//         if(st.peek().equals(minstack.peek())){
//            minstack.pop();
//         }
//         st.pop();
//     }
    
//     public int top() {
//         return st.peek();
//     }
    
//     public int getMin() {
//         return minstack.peek();
//     }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */