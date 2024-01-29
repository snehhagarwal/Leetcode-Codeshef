class Solution {
        static String[] a={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        public List<String> letterCombinations(String digits) {
        List<String> b=new ArrayList<>();
        combinations(digits,b,"");
        return b;
    }
    public void combinations(String digits,List<String> b,String ans){
        if(digits.length()==0){
            if(ans.length()!=0)
               b.add(ans);
            return;
        }
        char c=digits.charAt(0);
        String que=a[c-'0'-1];
        for(int i=0;i<que.length();i++){
            combinations(digits.substring(1),b,ans+que.charAt(i));
        }

    }
}