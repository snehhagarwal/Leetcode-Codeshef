class MyStack {

    Queue<Integer> qu=new LinkedList<>();
    public MyStack() {
    }
    
    public void push(int x){
        int size=qu.size();
        qu.add(x);
        for(int i=0;i<size;i++){
            qu.add(qu.peek());
            qu.remove();
        }
    }
    
    public int pop() {
       return qu.remove();
    }
    
    public int top() {
        return qu.peek();
    }
    
    public boolean empty() {
        if(qu.size()==0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */