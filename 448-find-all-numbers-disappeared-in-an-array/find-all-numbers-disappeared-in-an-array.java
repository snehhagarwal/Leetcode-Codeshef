class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int ele=Math.abs(nums[i]);
            if(nums[ele-1]>0){
                nums[ele-1]=-1*Math.abs(nums[ele-1]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
//         HashMap<Integer,Integer> map=new HashMap<>(); 
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
//         for(int i=1;i<=nums.length;i++){
//             if(!map.containsKey(i)){
//                 ans.add(i);
//             }
//         }
//         return ans;