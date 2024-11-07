class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*'){
                String left=expression.substring(0,i);
                String right=expression.substring(i+1);
                List<Integer> leftList = diffWaysToCompute(left);
                List<Integer> rightList = diffWaysToCompute(right);
                for(int l:leftList){
                    for(int r:rightList){
                        if(ch=='+'){
                            ans.add(l+r);
                        }
                        else if(ch=='-'){
                            ans.add(l-r);
                        }else{
                            ans.add(l*r);
                        }
                    }
                }
            }
        }
        if(ans.size()==0){
            ans.add(Integer.valueOf(expression));
        }
        return ans;
    }
}