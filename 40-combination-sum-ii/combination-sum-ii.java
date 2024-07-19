class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list=new ArrayList<>();
        print(ans,list,candidates,target,0);
        return ans;
    }
    public static void print(List<List<Integer>> ans,List<Integer> list,int[] candidates,int target,int index){
        if(target==0){
                ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i] ==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
                list.add(candidates[i]);
                print(ans,list,candidates,target-candidates[i],i+1);
                list.remove(list.size()-1);
            
        }
    }
}