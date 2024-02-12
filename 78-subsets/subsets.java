class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        print(result,list,0,nums);
        return result;
    }
    public static void print(List<List<Integer>> result,List<Integer> list,int index,int[] nums){ 
        result.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            print(result,list,i+1,nums);
            list.remove(list.size()-1);
        }
    }
}