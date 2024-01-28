class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        print(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public void print(int index,int[] candidates,int target,List<Integer> d,List<List<Integer>> ans){
        if(index==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(d));
            }return;
        }
        if(candidates[index]<=target){
            d.add(candidates[index]);
            print(index,candidates,target-candidates[index],d,ans);
            d.remove(d.size() - 1);
        }
        print(index+1,candidates,target,d,ans);
    }
}