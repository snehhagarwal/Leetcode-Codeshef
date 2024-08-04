class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        int size=0;
        for(int i=1;i<=n;i++){
            if(size==target.length){
                return ans;
            }
            ans.add("Push");
            if(i!=target[size]){
                ans.add("Pop");
            }
            else{
                size++;
            }
        }
        return ans;
    }
}