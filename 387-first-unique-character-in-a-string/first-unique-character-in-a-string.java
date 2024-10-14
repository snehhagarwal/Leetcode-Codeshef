class Solution {
    public int firstUniqChar(String s) {
        // int result=Integer.MAX_VALUE;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     int st=s.indexOf(ch);
        //     int en=s.lastIndexOf(ch);
        //     if(st==en){
        //         result=Math.min(st,result);
        //     }
        // }
        // if(result!=Integer.MAX_VALUE){
        //     return result;
        // }
        // return -1;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
