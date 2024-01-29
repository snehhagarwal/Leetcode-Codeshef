class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> a= new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        permutation(a,nums,b);
        return a;
    }
    public void permutation(List<List<Integer>> a,int[] nums,List<Integer> b){
        if(b.size()==nums.length){
            a.add(new ArrayList<>(b));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(b.contains(nums[i])) continue;
            b.add(nums[i]);
            permutation(a,nums,b);
            b.remove(b.size()-1);
        }
    }
}