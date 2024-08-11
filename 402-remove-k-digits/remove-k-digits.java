class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && (st.peek()-'0')>ch-'0'){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            return "0";
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        int idx=0;
        while(idx<ans.length() && ans.charAt(idx)=='0'){
            idx++;
        }
        if(idx==ans.length()){
            return "0";
        }
        return ans.substring(idx);
    }
}