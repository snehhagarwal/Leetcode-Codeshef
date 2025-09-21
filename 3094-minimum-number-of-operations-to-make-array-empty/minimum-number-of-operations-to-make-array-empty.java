class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        int ans=0;
        for(int i:mp.values()){
            if(i==1){
                return -1;
            }
            ans+=i/3;
            if(i%3!=0){
                ans++;
            }
        }
        return ans;
    }
}