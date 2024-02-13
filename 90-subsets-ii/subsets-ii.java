class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        print(result,list,nums,0);
        return result;
    }
    public static void print(List<List<Integer>> result,List<Integer> list,int[] nums,int idx){
        result.add(new ArrayList<>(list));
        for(int i=idx;i<nums.length;i++){
            if(i!=idx && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            print(result,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
}