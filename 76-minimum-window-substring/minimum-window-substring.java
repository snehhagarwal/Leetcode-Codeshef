class Solution {
    public String minWindow(String s, String t) {
        int i=0;
        int j=0;
        int cnt=0;
        int idx=-1;
        int len=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int k=0;k<t.length();k++){
            map.put(t.charAt(k),map.getOrDefault(t.charAt(k),0)+1);
        }
        while(j<s.length()){
            if(map.getOrDefault(s.charAt(j),0)>0){
                    cnt++;
            }
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
            while(cnt==t.length()){
                if(j-i+1<len){
                    len=j-i+1;
                    idx=i;
                }
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
                if(map.get(s.charAt(i))>0){
                    cnt--;
                }
                i++;
            }
            j++;            
        }
        if(idx==-1){
                return "";
            }
        return s.substring(idx,idx+len);
    }
}