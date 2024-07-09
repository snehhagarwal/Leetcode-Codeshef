class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int ans=print(nums,k)-print(nums,k-1);
        return ans;
    }
    public static int print(int[] nums,int k){
        int i=0;
        int j=0;
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            cnt+=j-i+1;
            j++;
        }
        return cnt;
    }
}