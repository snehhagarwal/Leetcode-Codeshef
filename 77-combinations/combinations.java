class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ac=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        print(1,ac,list,n,k);
        return ac;
    }
    public static void print(int start,List<List<Integer>> ac,List<Integer> list,int n,int k){
        if(k==list.size()){
            ac.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=n;i++){
            list.add(i);
            print(i+1,ac,list,n,k);
            list.remove(list.size()-1);
        }
    }
}