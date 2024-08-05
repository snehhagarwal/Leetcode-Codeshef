class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minstack=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(minstack.isEmpty() || val<=minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        if(st.peek().equals(minstack.peek())){
           minstack.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */