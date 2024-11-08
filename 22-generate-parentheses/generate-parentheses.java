class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a=new ArrayList<>();
        generate(n,0,0,"",a);
        return a;
    }
    public static void generate(int n,int open,int close,String ans,List<String> a){
        if(open==n && close==n){
             a.add(ans);
             return;

        }if(open<n){
            generate(n,open+1,close,ans+"(",a);
        }
        if(close<open){
            generate(n,open,close+1,ans+")",a);
        }
    
    }
}