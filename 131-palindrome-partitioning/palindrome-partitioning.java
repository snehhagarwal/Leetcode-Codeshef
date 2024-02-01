class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> a=new ArrayList<>();
        List<String> b=new ArrayList<>();
        func(0,s,a,b);
        return a;
    }
    public static void func(int index,String s,List<List<String>> a,List<String> b) {
        if(index==s.length()){
            a.add(new ArrayList<>(b));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(palin(s,index,i)){
                b.add(s.substring(index,i+1));
                func(i+1,s,a,b);
                b.remove(b.size()-1);
            }
        }
    }
    public static boolean palin(String s,int start,int end){
        while(start<=end){
        if(s.charAt(start++)!=s.charAt(end--)){
            return false;
        }
      } 
      return true;
    }
}