class Solution {
    public int minTimeToType(String word) {
        char ch='a';
        int t=word.length();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int r=Math.abs(c-ch);
            t+=Math.min(r,26-r);
            ch=c;
        }
        return t;
    }
}