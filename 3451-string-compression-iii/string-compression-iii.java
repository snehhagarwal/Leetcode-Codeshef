class Solution {
    public String compressedString(String word) {
        int cnt=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                cnt++;
                if(cnt==10){
                    sb.append(cnt-1).append(word.charAt(i));
                    cnt=1;
                }
            }else{
                sb.append(cnt).append(word.charAt(i-1));
                cnt=1;
            }
        }
        sb.append(cnt).append(word.charAt(word.length()-1));
        return sb.toString();
    }
}