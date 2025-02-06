class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> p=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int prod=nums[i]*nums[j];
                ans+=p.getOrDefault(prod,0);
                p.put(prod,p.getOrDefault(prod,0)+1);
            }
        }
        return ans*8;
    }
}