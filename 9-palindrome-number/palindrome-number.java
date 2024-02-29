class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
        int sum=0;
        int k=x;
        while(x!=0){
            int r=x%10;
            x=x/10;
            sum=sum*10+r;
        }
        if(sum==k){
            return true;
        }else{
            return false;
        }}
    }
}