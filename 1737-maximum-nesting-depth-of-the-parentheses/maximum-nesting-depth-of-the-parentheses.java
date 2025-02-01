class Solution {
    public int maxDepth(String s) {
        int c=0;
        int m=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                c++;
                if(m<c){
                    m=c;
                }
            }
            if(ch==')'){
                c--;
            }
        }
        return m;
    }
}