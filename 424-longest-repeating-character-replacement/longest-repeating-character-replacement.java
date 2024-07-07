class Solution {
    public int characterReplacement(String s, int k) {
        //brute force
        int max=0;
        for(int i=0;i<s.length();i++){
            int[] arr=new int[26];
            int maxfreq=0;
            for(int j=i;j<s.length();j++){
                arr[s.charAt(j)-'A']++;
                maxfreq=Math.max(maxfreq,arr[s.charAt(j)-'A']);
                int changes=(j-i+1)-maxfreq;
                if(changes<=k){
                    max=Math.max(j-i+1,max);
                }else{
                    break;
                }
            }
        }
        return max;
    }
}