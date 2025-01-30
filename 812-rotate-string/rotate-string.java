class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(sb.append(sb.charAt(0)).deleteCharAt(0).toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}