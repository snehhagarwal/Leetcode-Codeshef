class Solution {
    public boolean canBeValid(String s, String locked) {
        int l=s.length();
        if(l%2!=0){
            return false;
        }
        int change=0;
        int open=0;
        for(int i=0;i<l;i++){
            if(locked.charAt(i)=='1'){
                if(s.charAt(i)=='('){
                    open++;
                }else{
                    open--;
                }
            }else{
                change++;
            }
            if(open< -change){
               return false;
            }
        }
        int close=0;
        int changes=0;
        for(int i=l-1;i>=0;i--){
            if(locked.charAt(i)=='1'){
                if(s.charAt(i)==')'){
                    close++;
                }else{
                    close--;
                }
            }
            else{
                changes++;
            }
            if(close< -changes){
               return false;
            }
        }
        return true;
    }
}