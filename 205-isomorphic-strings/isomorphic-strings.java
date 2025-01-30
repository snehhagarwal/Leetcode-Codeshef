class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> rev=new HashSet<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a)!=b){
                    return false;
                }
            }
            else{
                if(rev.contains(b)){
                    return false;
                }
                map.put(a,b);
                rev.add(b);
            }
        }
        return true;
    }
}