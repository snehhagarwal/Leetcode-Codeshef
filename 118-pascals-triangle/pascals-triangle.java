class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=generaterow(numRows);
        return ans;
    }
    public static List<List<Integer>> generaterow(int n){
            List<List<Integer>> row = new ArrayList<>();
            for(int i=1;i<=n;i++){
                   row.add(ele(i));
            }
            return row;
    }
    public static List<Integer> ele(int n){
        List<Integer> r=new ArrayList<>();
        long ans=1;
        r.add((int)ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            r.add((int)ans);
        }
        return r;
    }

}