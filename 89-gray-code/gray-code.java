class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        int t=(int)Math.pow(2,n);
        int k=0;
        for(int i=0;i<t;i++){
            k^=i&(-i);
            ans.add(k);
        }
        return ans;
    }
}