class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        while(j<s.length()){
            if(mp.containsKey(s.charAt(j))){
                i=Math.max(i,mp.get(s.charAt(j))+1);
            }
            mp.put(s.charAt(j),j);
            max=Math.max(j-i+1,max);
            j++;
        }
        return max;
    }
}