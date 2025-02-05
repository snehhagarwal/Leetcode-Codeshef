class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int cnt=0;
        int f=-1;
        int s=-1;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                cnt++;
                if(cnt==1){
                    f=i;
                }
                if(cnt==2){
                    s=i;
                }
                if(cnt>2){
                    return false;
                }
            }
        }
        return cnt==2 && s1.charAt(f)==s2.charAt(s) && s1.charAt(s)==s2.charAt(f);
    }
}
// StringBuilder sb=new StringBuilder(s1);
//         for(int i=0;i<s1.length();i++){
//             sb.setCharAt(i, s1.charAt(i)); 
//             if(sb.toString().equals(s2)){
//                 return true;
//             }
//         }
//         return false;