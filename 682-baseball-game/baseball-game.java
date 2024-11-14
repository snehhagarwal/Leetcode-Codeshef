class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            switch(s){
                case "C":
                   st.pop();
                   break;
                case "D":
                   st.push(st.peek()*2);
                   break;
                case "+":
                   int x=st.pop();
                   int y=st.peek();
                   st.push(x);
                   st.push(x+y);
                   break;
                default:
                   st.push(Integer.parseInt(s));
                   break;  
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}