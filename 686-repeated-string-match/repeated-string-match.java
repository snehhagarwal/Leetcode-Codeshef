class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=0;
        String str="";
        int len=b.length()/a.length();
        for(int i=0;i<len+2;i++){
              str=str+a;
              count++;
              if(str.contains(b)){
                 return count;
              }
        }
        return -1;
    }
}